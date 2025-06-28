package patterns;
import java.util.*;
public class inverted_right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the triangle: ");
        int l = sc.nextInt();

        for(int i=l;i>=0 && i<=l;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
