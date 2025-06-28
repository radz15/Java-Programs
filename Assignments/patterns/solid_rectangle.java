package patterns;

import java.util.*;

public class solid_rectangle { 
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length: ");
    int l = sc.nextInt();
    System.out.println("Enter the breadth: ");
    int b = sc.nextInt();

    for(int i=0;i<b;i++)
    {
        for(int j=0;j<l;j++)
        { 
        System.out.print(" * ");
        }
        System.out.println();
    }
    
   
sc.close();
}
}
