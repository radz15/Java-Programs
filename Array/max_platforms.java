import java.util.*;
public class max_platforms{
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(dep);
        Arrays.sort(arr);

        int count = 0;
        for(int i=1;i< arr.length;i++)
        {
            for(int j=0; j<dep.length-1;j++)
            {
                if(arr[i]<=dep[j])
                {
                    count ++;
                }
                else{
                    count --;
                }
            }
        }
        System.out.println(count);
    }
}