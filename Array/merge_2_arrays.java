import java.util.*;
public class merge_2_arrays {
    public static void main(String[] args){
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};

        int merged[] = new int [a1.length + a2.length];
        for(int i=0; i<a1.length; i++)
        {
            merged[i]=a1[i];
        }
        for(int i=0; i<a2.length;i++)
        {
            merged[a1.length+i] = a2[i];
        }
        System.out.println("merged string: "+ Arrays.toString(merged));

    }
    
}
