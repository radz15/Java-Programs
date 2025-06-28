import java.util.*;
public class day_14_reverse_password{

    public static void originalPassword(String password, String pass)
    {
        if(pass.equals(password))
        {
            System.out.println("Move to next step..");
        }
        else{
            System.out.println("Worng password.. ");
        }
    }

    public static void reversePassword(String password, String rev)
    {
        String reversed = "";
        for(int i =password.length()-1;i>=0;i--)
        {
            reversed += password.charAt(i);
        }
        if(reversed.equals(rev))
        {
            System.out.println("Access granted..");
        }
        else
        {
            System.out.println("Incorrect password");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Radhika";
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        originalPassword(password,pass);
        System.out.println("Enter the reversed password: ");
        String rev = sc.nextLine();
        reversePassword(password,rev);

        sc.close();
    }
}