import java.util.*;
public class Bubble_sort{
    public static void main(String[] args){
        int arr[] = {4,2,5,7,11,1};

        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}