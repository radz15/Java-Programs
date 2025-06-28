import java.util.*;
public class food_ordering_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menue: ");
        System.out.println("1- Dal Roti");
        System.out.println("2- Rasam Rice");
        System.out.println("3- Chole Bhature");
        System.out.println("4- Curd Rice");
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter you choices: ");
        for(int i=0; i<=n-1; i++)
        {
       
        int choice = sc.nextInt();
        

        switch(choice){
            case 1:
                sum += 240;
                System.out.println("240 + ");
                break;
            case 2:
                sum += 200;
                System.out.println("200 + ");
                break;
            case 3:
                sum += 300;
                System.out.println("300 + ");
                break;
            case 4:
                 sum += 100;
                System.out.println("100 + ");
                break;
            default: 
                System.out.println("Enter the correct option: ");
        }
    }
        System.out.println("total = "+sum);
        sc.close();
    }
}
