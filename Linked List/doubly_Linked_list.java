class Node{
    int data;
    Node prev;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class doubly_Linked_list
{

        Node head = null;

        public void insertAtBeg(int data)
        {
            Node newNode = new Node(data);
            newNode.next = head;
            if(head != null)
            {
                head.prev = newNode;
            }
            
            head = newNode;
        }

        public void insertAtEnd(int data)
        {
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        public void deleteAtBeg(){
            if(head == null)
            {
                System.out.println("List is Empty..");
            }

            Node temp = head;
            head = head.next;

            if(head!=null)
            {
                head.prev = null;
            }
        }

        public void display()
        {
            if(head == null)
            {
                System.out.println("List is empty..");
            }
            Node temp = head;
            while(temp!= null)
            {
                System.out.print(temp.data +"-->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        
        
        public static void main(String[] args) {
            doubly_Linked_list list = new doubly_Linked_list();

            list.insertAtBeg(20);
            list.insertAtBeg(30);

            list.insertAtEnd(40);

            list.deleteAtBeg();

            list.display();
        }

}