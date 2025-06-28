import java.util.Arrays;

public class update_3index {
    public static void main(String[] args){
        int a[] = {10, 20, 30, 40, 50};
        a[3] = 70;
       // System.out.println(Arrays.toString(a)); --- this can also be used
        for(int num : a)
        {
            System.out.print(" " + num);
        }
    }
    
}
