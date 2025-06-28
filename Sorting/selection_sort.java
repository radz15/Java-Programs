import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {4, 8, 12, 6, 5, 3, 1};

         for(int i=0;i<arr.length-1;i++)
         {
            int min_index = i;
            
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
                
            }
            int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
         }
         System.out.println(Arrays.toString(arr));
    }
}
