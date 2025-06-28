import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("Enter the number: ");
        for(int i=0;i<n;i++)
        {
            int digit = sc.nextInt();
            sum += digit;
        }
        System.out.println("The sum is: "+sum);
        sc.close();
    }
}
