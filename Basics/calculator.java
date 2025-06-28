import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

       // System.out.println("Choose your operation: 1: + ; 2: - ; 3: * ; 4: / ");
       // int operator = sc.nextInt();
       // switch(operator){
       //     case 1: 
       //         System.out.println(a+ " + "+b+" = "+(a+b));
       //         break;
       //     case 2:
       //         System.out.println(a+" - "+b+" = "+(a-b));
       //         break;
       //     case 3:
       //         System.out.println(a+" * "+b+" = "+(a*b));
       //         break;
       //     case 4:
       //         System.out.println(a+" / "+b+" = "+(a/b));
       //         break;
       //     default:
       //         System.out.println("Enter the correct option..");
       // }

       System.out.println("Enter the operator: ");
       char operator = sc.next().charAt(0);
       int output ;

       switch(operator){
                case ('+'): 
                        output = a+b;
                        System.out.println(output);
                        break;
                case ('-'):
                        output = a-b;
                        System.out.println(output);
                        break;
                case ('*'):
                        output = a*b;
                        System.out.println(output);
                        break;
                case ('/'):
                        output = a/b;
                        System.out.println(output);
                        break;
                default:
                        System.out.println("Enter the correct operator: ");
       }
       
       sc.close();
    }
}
