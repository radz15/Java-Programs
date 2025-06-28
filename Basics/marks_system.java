import java.util.*;
public class marks_system {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks of the student: ");
        int marks = sc.nextInt();

        System.out.println("Grade: ");    
        if(marks>=90)
        {
            System.out.println("A");
        }
        else if(90>marks && marks>=70)
        {
            System.out.println("B");
        }
        else if(70>marks && marks>=60)
        {
            System.out.println("C");
        }
        else if(60>marks && marks>=50)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();
    }
}
