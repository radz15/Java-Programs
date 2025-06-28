import java.util.*;
class MyStack{
    int coach[] = new int[5];
    int top = -1;

    public void push(int data)
    {
        if(top==coach.length-1)
        {
            System.out.println("Coach Yard is full.. ");
            return;
        }
        else
        {
            top++;
            coach[top] = data;
            System.out.println("Pushed Coach: "+coach[top]);
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Coach yard is empty..");
            return;
        }
        else
        {
            System.out.println("Popped element: "+coach[top]);
            top --;
        }
    }

    public void peek()
    {
        if(top == -1)
        {
            System.out.println("Coach Yard is empty");
            return;
        }
        else
        {
            System.out.println("The top coach present is: "+coach[top]);
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == coach.length-1;
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Coach yard is empty..");
            return;
        }
        else{ 
            for(int i=top;i>=0;i--)
            {
                System.out.println("The coach Yard has: "+coach[i]);
            }
        }
    }

}
public class railway_coach_yard {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        while(true)
        { 
                    System.out.println("Enter the choice: ");
                    System.out.println("1- push ");
                    System.out.println("2- pop ");
                    int choice = sc.nextInt();

                    switch(choice)
                    { 
                        case 1:
                                System.out.println("Enter the number of coaches: ");
                                int num = sc.nextInt();
                                int coaches[] = new int [num];
                                if(stack.isFull())
                                {
                                    System.out.println("Yard is full...");
                                }
                                else
                                {
                                        
                                        System.out.println("Enter the coaches to be entered by their ID: ");
                                        System.out.println("1- AC coach");
                                        System.out.println("2- General Coach");
                                        for(int i=0;i<coaches.length;i++)
                                        {
                                            coaches[i] = sc.nextInt();
                                        }
                                        System.out.println("Coach IDs entered: "+ Arrays.toString(coaches));
                                        Arrays.sort(coaches);
                                        System.out.println("Coach IDs in their priority order are: "+Arrays.toString(coaches));
                                        for(int i=0;i<coaches.length;i++)
                                        {
                                            stack.push(coaches[i]);
                                        }
                                }
                                break;
                            
                            case 2:
                                        if(stack.isEmpty())
                                        {
                                                System.out.println("The yard is empty..");
                                        }
                                        else
                                        {
                                                    stack.pop();                                    
                                        }
                    }
                    stack.display();
        }
    }
}
