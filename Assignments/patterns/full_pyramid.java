package patterns;
import java.util.*;
public class full_pyramid {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
