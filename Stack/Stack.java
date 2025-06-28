class stackClass{
    int a [] = new int [5];
    int top = -1;

    public void push(int data)
    {
        if(top == a.length- 1) //stack is already full
        {
            System.out.println("Overflow..");
            return;
        }
         else{
            top ++;
            a[top] = data;
            System.out.println("Pushed element: "+a[top]);
         }
    }

    public void pop()
    {
        if (top== -1)
        {
            System.out.println("Stack is empty...");
        }
        else
        {
                System.out.println("Popped elements: "+a[top]);
                top --;
        }
    }

    public void peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty..");
            return;
        }

        else{
                System.out.println("Peek at top element: " + a[top]);

        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == a.length -1;
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Empty List..");
            return;
        }
        else{
            for (int i =top;i>=0;i--)
            {
                System.out.println("Stack: "+a[i]);
            }
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        stackClass stack = new stackClass();
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.peek();

        stack.display();

    }
}
