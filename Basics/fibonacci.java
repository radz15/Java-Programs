import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series: ");
        int n = sc.nextInt();
        
        int sum[] = new int[n+1];

        sum[0] = 0;
        sum[1] = 1;

        for(int i=2;i<=n;i++)
        {
            sum[i] = sum[i-1]+ sum[i-2];
        }
        System.out.println("fibonacci serires: "+ Arrays.toString(sum));
        sc.close();
    }
}
