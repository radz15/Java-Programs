import java.util.*;
public class TCS_train_booking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total=0;

        System.out.println("Enter the number of tickets: ");
        int num = sc.nextInt();
        

        for(int i=1; i<=num; i++)
        {
            
            System.out.println("Enter the Age group of member "+ i);
            int age = sc.nextInt();
            if (age>60)
            {
                total += 30;
            }
            else if(age<12)
            {
                total += 20;
            }
            else 
            {
                total += 50;
            }
        }
        System.out.println(total);
        if(total>500)
        {
            double discount = 0.05 * total;
            total -= discount;
            System.out.println("Discount applied : "+ discount);
        }
        System.out.println("Total Price after discount = "+total);
        sc.close();
    }
}
