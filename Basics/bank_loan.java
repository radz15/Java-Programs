import java.util.*;
public class bank_loan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print( "Do you have a PAN card? True or False: ");
        boolean pan = sc.nextBoolean();

        System.out.print("Do you have a Cibil score MORE THAN 700? True or False: ");
        boolean cibil = sc.nextBoolean();

        System.out.print("Do you have a Aadhar card? True or False: ");
        boolean aadhar = sc.nextBoolean();

        if(pan && cibil && aadhar)
        {
            System.out.println("You are eligible for a BAnk loan!!");
        }
        else
        {
            System.out.println("You are not eligible for a bank loan..");
        }
        sc.close();
    }
}
