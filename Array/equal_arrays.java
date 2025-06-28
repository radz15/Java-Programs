import java.util.*;

public class equal_arrays {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};
        boolean areEqual = Arrays.equals(a,b);
    if(areEqual)
    {  
        System.out.println("Arrays are equal...");
    }
    else    
    {
        System.out.println("The arrays are not equal..");
    }
    
    }
}
