import java.util.Scanner;
class Authorization_consol(){
    String username;
    String userID;
    String password;
}

public String enter_details()
 {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter you userID: ");
        String userID = sc.nextLine();
        System.out.println("Enter you password: ");
        String password = sc.nextLine();

        String user[] = {username,userID,password};
        for(String detail : user)
        {
        System.out.println(detail);
        }
}
public String authentication()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you userID: ");
    String userID = sc.nextLine();
    System.out.println("Enter you password: ");
    String password = sc.nextLine();

    

}




public class console {
    public static void main(String[] args){
        
    }    
}
