import java.util.Scanner;

public class factoria_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("Fatctorial is: "+fact);
        sc.close();
    }
}
