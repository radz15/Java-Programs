import java.util.Arrays;

public class reverse_array{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int start = 0;
        int end = a.length-1;
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
