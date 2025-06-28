import java.util.*;
public class eligible_to_vote_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age<18)
        {
            System.out.println("Not eligible to vote..");
        }
        else{
            System.out.println("Eligible to vote..");
        }
        sc.close();
    }
}
