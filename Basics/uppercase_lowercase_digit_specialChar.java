import java.util.*;
public class uppercase_lowercase_digit_specialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(Character.isUpperCase(ch))
        {
            System.out.println("UpperCase");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println("LowerCase");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}
