package patterns;
import java.util.*;
public class half_pyramid_with_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
        int l = sc.nextInt();

        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
