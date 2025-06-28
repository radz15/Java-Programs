import java.util.Scanner;

public class day_1_product_of_nums_in_range{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the begining of the range: ");
        int beg = sc.nextInt();

        System.out.println("Enter the end of the range: ");
        int end = sc.nextInt();

        if (beg>end)
        {
            System.out.println("Your range is invalid!!");
        }
        else 
        {
            int prod = 1;
            for(int i=beg;i<=end;i++)
            {
                prod *= i ;
            }
            System.out.println(prod);
        }
        sc.close();
    }
}