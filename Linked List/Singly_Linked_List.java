// SINGLY LINKED LIST
class Node{
    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;

    }
}
public class Singly_Linked_List {

    Node head = null; // need to initialize head

    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtAnyPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos<0)
        {
            System.out.println("Invalid position");

        }
        
        if(pos == 0)
        {
            insertAtBeg(data);
            return;
        }

        Node temp = head;
        for(int i=1;i<pos-1;i++)
        {
            if(temp == null)
            {
                System.out.println("Out of bounds..");
                return;
            }
            temp = temp.next;
        }
        //again check
        if (temp == null) 
        {
        System.out.println("Position out of bounds.");
        return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtEnd()
    {
        if(head == null) // if list is empty
        {
            System.out.println("List is empty..");
        }
        if(head.next == null)  // if list has only one node
        {
            head = null;   // delete the node
            return;
        }
        Node temp = head;  
        while(temp.next.next != null)  // temp.next.next mean 2 nodes ahead from temp; meaning second last node
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPos(int pos)
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("List is empty..");
            return;
        }
        else if(pos == 1)
        {
            head = temp.next;
            return;
        }
        for(int i=1; temp!=null&&i<pos-1;i++)
        {
            temp = temp.next;
        }
        if(temp == null || temp.next == null)
        {
            System.out.println("Out of range..");
        }
        temp.next = temp.next.next;
    }

    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Singly_Linked_List list = new Singly_Linked_List();
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtBeg(40);
        list.insertAtBeg(50);

        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);

        list.insertAtAnyPos(1, 10);

        list.deleteAtEnd();
        list.deleteAtPos(3);

        list.display();
    }
}