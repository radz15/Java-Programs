import java.util.Scanner;

public class binary_search{
    public static void main(String[] args){
        int[] a={10,20,30,40,50,60};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your key: ");
        int key = sc.nextInt();

        int low = 0;
        int high = a.length-1;

        boolean found = false;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(a[mid]==key)
            {
                System.out.println(" Found at index: "+ mid);
                found = true;
                break;
            }
            else if (a[mid]<key)
            {
               low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        sc.close();
    }
}