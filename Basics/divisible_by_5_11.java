import java.util.*;
public class divisible_by_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5 == 0 && n%11 == 0)
        {
            System.out.println("The number is divisible by 5 and 11....");
        }
        else{
            System.out.println("Number is not divisile by 5 and 11: ");
        }
        sc.close();
    }
}
