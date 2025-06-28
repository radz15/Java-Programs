import java.util.Scanner;

public class swap_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number a = ");
        int a = sc.nextInt();
        System.out.println("second number b = ");
        int b = sc.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        sc.close();
    }
}
