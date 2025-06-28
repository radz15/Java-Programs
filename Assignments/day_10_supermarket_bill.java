import java.util.*;
public class day_10_supermarket_bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        int price[] = new int[n+1];
        int sum = 0;
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the price of item "+i+" : ");
            price[i] = sc.nextInt();
            sum += price[i];
        }
        System.out.println("Total Bill: "+sum);
        sc.close();
    }
}