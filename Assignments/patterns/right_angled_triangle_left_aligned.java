package patterns;
import java.util.*;
public class right_angled_triangle_left_aligned {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        int l = sc.nextInt();

        for(int i=0;i<l;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
