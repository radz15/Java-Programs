import java.util.*;

public class Addition_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of two numbers is: " + (a + b));
        sc.close();
    }
}
