import java.util.*;
public class day_11_sort_temp_readings{
    public static void main(String[] args){
        //take in readings
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of readings: ");
        int n = sc.nextInt();
        int temp[] = new int[n];
        System.out.println("Enter the readings: ");
        for(int i=0;i<n;i++)
        {
            temp[i] = sc.nextInt();
        }
        // bubble sort the readings
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(temp[j]>temp[j+1])
                { 
                int ind = temp[j];
                temp[j] = temp[j+1];
                temp[j+1] = ind ; 
                }
                
            }
        }
        System.out.println(Arrays.toString(temp));

    }
}