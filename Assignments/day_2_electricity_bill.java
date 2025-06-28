import java.util.*;
public class day_2_electricity_bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the connection type (Residential/Commercial): ");
        String connection = sc.nextLine();

        int amount = 0;

        if (connection.equalsIgnoreCase("Residential")){
        
          if(units<=100)
            {
                amount += units * 2;
            }
            else if(units>100 && units<=300)
            {
                amount += (100 * 2) + (units - 100)* 3;
            }
            else
            {
                amount += (100 * 2) + (200 * 3) + (units - 300)*5;
            }
        }
    
    else if (connection.equalsIgnoreCase("Commercial")){
            if(units<=100)
            {
                amount += units * 5;
            }
            else if(units>100 && units<=300)
            {
                amount += (100 * 5) + (units - 100) * 7;
            }
            else 
            {
                amount += (100 * 5) + (200 * 7) + (units - 300) * 10;
            }
        }
    
    System.out.println("Final Bill Amount: "+amount);
    sc.close();
}
}