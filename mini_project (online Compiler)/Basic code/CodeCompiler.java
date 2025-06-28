import java.io.*;
import java.util.Scanner;

public class CodeCompiler {
    public static void main(String[] args) throws IOException, InterruptedException { // It throws exceptions in case file reading/writing or process running fails
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose language:");
        System.out.println("1 - C");
        System.out.println("2 - C++");
        System.out.println("3 - Python");
        System.out.println("4 - Java");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        String fileName = "", compileCommand = "", runCommand = "";
        switch (choice) { // file name, compilation and run commands
            case 1 -> {
                fileName = "main.c";
                compileCommand = "gcc main.c -o main";
                runCommand = "main.exe";
            }
            case 2 -> {
                fileName = "main.cpp";
                compileCommand = "g++ main.cpp -o main";
                runCommand = "main.exe";
            }
            case 3 -> {
                fileName = "script.py";
                compileCommand = ""; // No compile needed.. interpretation during runntime
                runCommand = "python script.py";
            }
            case 4 -> {
                fileName = "Main.java";
                compileCommand = "javac Main.java";
                runCommand = "java Main";
            }
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }

        // Ask user for their code
        System.out.println("\nEnter your code below. Type 'EOF' alone on a new line to finish:");
        StringBuilder code = new StringBuilder(); // string builder is a type of class where the string is mutable
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("EOF")) break; // break at EOF
            code.append(line).append(System.lineSeparator()); //add the line to the String Builder;for line eperator add \r\n
        }

        // Write to file
        // if file doesnt exist it will create it and if exists it will overwite
        FileWriter writer = new FileWriter(fileName); //Creates FileWriter object; prepares to write into file whose name is fileName
        writer.write(code.toString()); // conver String Builer (code) to string
        writer.close(); 

        // Compile (if needed)
        if (!compileCommand.isEmpty()) { // checks if cmplie command is not empty; C,C++,Java-true; python-false
            System.out.println("\nCompiling...");
            Process compile = Runtime.getRuntime().exec(compileCommand); //runs the compile command in the terminal
            compile.waitFor(); //waits for the compile process to finish

            // Show compilation errors if any ; if yes goes to ErrorStream (standard error) ; this line prepares to read those error messages
            BufferedReader compileErr = new BufferedReader(new InputStreamReader(compile.getErrorStream()));
            String errLine;
            boolean errorFound = false; //initially false
            while ((errLine = compileErr.readLine()) != null) {
                System.err.println(errLine); // print error
                errorFound = true;  //change error found to true
            }
            if (errorFound) return; // if error is found return 
        }

        // Run
        System.out.println("\nRunning...");
        Process run = Runtime.getRuntime().exec(runCommand); 
        //Runtime.getRuntime() - opens acces to the CLI from inside java
        // exec(runCommand) - the run command is executed in the CLI

        // Output
        // there are 2 parts 
        // 1- Standard output (Normal output of the program)
        // 2- Standard error  (error messages)
        
        //run.getInputStream() - give mormal output of the program
        //InputStreamReader - converts into characters
        //BufferedReader - reads line by line
        BufferedReader output = new BufferedReader(new InputStreamReader(run.getInputStream())); 
        String line;
        System.out.println("Output:");
        while ((line = output.readLine()) != null) { //reads line by line
            System.out.println(line); // Ex: System.out.println("Hello World"); --- Hello World
        }

        // Runtime Errors
        //run.getErrorStream()- gives access to error messages
        BufferedReader error = new BufferedReader(new InputStreamReader(run.getErrorStream()));
        while ((line = error.readLine()) != null) { //reads each line of the error
            System.err.println(line); // prints the error messages in red
        }
    }
}
