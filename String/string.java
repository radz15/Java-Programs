public class string{
    public static void main(String[] args) {
        String str = "Hello World";  // initialize the string
        System.out.println(str);  // print the string
        System.out.println("Length: "+ str.length());  // length of string
        System.out.println("Value at index 4: "+ str.charAt(4));  // value at particualr index

        String str1 = "Hello my dear";
        String str2 = "Hello my dear";
        System.out.println("Check if strings are equal: "+ str1.equals(str2)); // checks if both the strings are equal and returns boolean value

        String original = "Hello World";
        String upper = original.toUpperCase(); // coverts string to uppercase
        String lower = original.toLowerCase(); // converts string to lowercase
        System.out.println("Uppercase: "+upper); // OR System.out.println("uppercase: "+ original.toUpperCase());
        System.out.println("Lowercase: "+lower); // OR System.out.println("lowercase: "+original.toLowerCase());

        String input = "Hello World";
        String output = input.substring(0,5).toUpperCase(); // prints only part of a string form begin index to end index specified 
        System.out.println(" output in uppercase: " + output);

        // search of a given character in a string
        char ch = 'a';
        String name = "Radhika";
        for(int i =0; i<name.length();i++)
        {
            if(ch == name.charAt(i))
            {
                System.out.println("yes");
                break;
            }
            else if (ch != name.charAt(i))
            {
                
            }
        }
        
        // counting the no.of target char in the string
        char target = 'l'; // it is L
        int count = 0;

        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==target)
            {
                count ++;
            }
        }
        if(count>0)
        {
            System.out.println(count + " times");
        }
        else{
            System.out.println("The character does not exist in the string..");
        }

        // reverse a string
        String reverse = " ";
        int start = 0;
        int end = str.length()-1;
        int temp;

        for(int i= str.length()-1; i>=0; i--)
        {
           reverse += str.charAt(i);
        }
        System.out.println("Reversed string: "+reverse);
    }
}