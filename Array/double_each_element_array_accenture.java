import java.util.Arrays;

public class double_each_element_array_accenture{
    public static void main(String[] args){
        int a[] = {10, 20, 30, 40, 50};
        for(int i=0;i<a.length;i++)
        {
            a[i] = a[i]*2;
        }
         System.out.println("Doubled array is: " + Arrays.toString(a));
    }
}