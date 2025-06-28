package com.compiler.onlinecompiler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.concurrent.TimeUnit;

@Controller
public class CompilerController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/run")
    @ResponseBody
    public ResponseEntity<String> runCode(@RequestParam String language,
                                          @RequestParam String code,
                                          @RequestParam(required = false) String input) {
        try {
            String output = executeCode(language, code, input);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Server Error:\n" + e.toString());
        }

    }

    private String executeCode(String language, String code, String input) throws IOException, InterruptedException {
        String fileName;
        File codeFile;
        switch (language) {
            case "java": fileName = "Main.java"; break;
            case "c":    fileName = "Main.c";    break;
            case "cpp":  fileName = "Main.cpp";  break;
            case "python": fileName = "script.py"; break;
            default: throw new IllegalArgumentException("Unsupported language: " + language);
        }

        codeFile = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(codeFile))) {
            writer.write(code);
            writer.newLine(); // ensures newline at end of file
        }


        File inputFile = new File("input.txt");
        if (input != null && !input.trim().isEmpty()) {
            try (FileWriter inWriter = new FileWriter(inputFile)) {
                inWriter.write(input);
            }
        }

        String output;
        switch (language) {
            case "c":
                output = compileAndRun(new ProcessBuilder("gcc", fileName, "-o", "Main.exe"), "./Main.exe", inputFile, true);
                break;
            case "cpp":
                output = compileAndRun(new ProcessBuilder("g++", fileName, "-o", "Main.exe"), "./Main.exe", inputFile, true);
                break;
            case "python":
                output = runProgram("python", "script.py", inputFile);
                break;
            case "java":
                ProcessBuilder compilePb = new ProcessBuilder("javac", "Main.java");
                compilePb.redirectErrorStream(true);
                Process compile = compilePb.start();

                StringBuilder compileErrors = new StringBuilder();
                try (BufferedReader compileReader = new BufferedReader(new InputStreamReader(compile.getInputStream()))) {
                    String line;
                    while ((line = compileReader.readLine()) != null) {
                        compileErrors.append(line).append("\n");
                    }
                }

                int compileResult = compile.waitFor();
                if (compileResult != 0) {
                    return "Compilation Error:\n" + compileErrors;
                }

                output = runProgram("java", "Main", inputFile);
                break;
            default:
                output = "Language not supported.";
        }

        cleanupFiles(codeFile, inputFile, language);
        return output;
    }

    private String compileAndRun(ProcessBuilder compilePb, String runCmd, File inputFile, boolean showDetailedError) throws IOException, InterruptedException {
        compilePb.redirectErrorStream(true);
        Process compile = compilePb.start();

        StringBuilder compileOutput = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(compile.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                compileOutput.append(line).append("\n");
            }
        }

        if (compile.waitFor() != 0) {
            return "Compilation Error:\n" + (showDetailedError ? compileOutput.toString() : "Compilation failed.");
        }

        return runProgram(runCmd, null, inputFile);
    }

    private String runProgram(String command, String arg, File inputFile) throws IOException, InterruptedException {
        ProcessBuilder runPb = (arg != null) ? new ProcessBuilder(command, arg) : new ProcessBuilder(command);
        runPb.redirectErrorStream(true);
        Process process = runPb.start();

        if (inputFile != null && inputFile.exists()) {
            try (
                BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
                BufferedReader inputReader = new BufferedReader(new FileReader(inputFile))
            ) {
                String line;
                while ((line = inputReader.readLine()) != null) {
                    processInput.write(line);
                    processInput.newLine();
                }
                processInput.flush();
            }
        }

        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        }

        boolean finished = process.waitFor(10, TimeUnit.SECONDS);
        if (!finished) {
            process.destroyForcibly();
            return "Error: Execution timed out (10 seconds).";
        }

        return output.toString();
    }

    private void cleanupFiles(File codeFile, File inputFile, String language) {
        if (codeFile.exists()) codeFile.delete();
        if (inputFile.exists()) inputFile.delete();

        if (language.equals("java")) new File("Main.class").delete();
        else if (language.equals("c") || language.equals("cpp")) new File("Main.exe").delete();
    }
}
