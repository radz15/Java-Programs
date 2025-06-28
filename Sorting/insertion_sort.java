import java.util.*;

public class insertion_sort {
    public static void main(String[] args){
        int arr[] = {4,5,1,2,6};
         for(int i=1;i<arr.length;i++)
         {
            int key = arr[i];
            int j = i -1;
            
            while(j>=0 && key<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
         }
         System.out.println(Arrays.toString(arr));
    }
}
