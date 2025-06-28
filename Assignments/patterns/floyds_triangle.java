package patterns;
import java.util.*;
public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print((j+i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
