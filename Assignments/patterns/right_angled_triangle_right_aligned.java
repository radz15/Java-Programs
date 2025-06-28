package patterns;
import java.util.*;
public class right_angled_triangle_right_aligned{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght value: ");
        int l = sc.nextInt();

        for(int i=0;i<=l;i++)
        {   
            for(int j=0;j<=l-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            { 
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}