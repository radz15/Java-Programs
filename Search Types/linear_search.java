import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a ={10, 5 ,25, 1, 78, 30};

        System.out.println("Enter your key element: ");
        int key = sc.nextInt();

        for( int i=0; i<a.length; i++)
        {
            if(a[i]==key)
            {
                System.out.println("Found at location: "+ i);
                break;
            }
        }
    }
}
