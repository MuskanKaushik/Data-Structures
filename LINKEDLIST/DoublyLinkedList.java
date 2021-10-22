public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;
    
    public class Node{
        int data;
        Node previous;
        Node next;

        Node(int d)
        {
            this.data = d;
        }
    }

    DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return length == 0; // head == null
    }

    public int length()
    {
        return length;
    }

    public void displayForward()
    {
        if(head == null)
        {
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print(" NULL ");
    }
    
    public void displayBackward()
    {
        if(tail == null)
        {
            return;
        }

        Node temp = tail;
        while( temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print(" NULL ");
    }

    public void insertLast(int value)
    {
        Node newNode = new Node(value);
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(25);

        dll.displayForward();
        System.out.println();
        dll.displayBackward();
    }
}
