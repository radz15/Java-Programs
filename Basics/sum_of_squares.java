import java.util.*;

public class sum_of_squares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=m;i<=n;i++)
        {
                int sq = i*i;
                sum += sq;

        }
        if(m<=n)
        {  
        System.out.println("The sum of squares is: "+sum);
        }
        else
        {
            System.out.println("Enter the correct range..");
        }
        sc.close();
    }
}
