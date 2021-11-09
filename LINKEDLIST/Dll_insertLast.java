public class Dll_insertLast {
    Node head;
    Node tail;
    int length;

    public class Node{
        int data;
        Node next;
        Node previous;

        Node(int d)
        {
            this.data = d;
        }
    }

    Dll_insertLast()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public void displayForward()
    {
        if(head == null)
        {
            return;
        }

        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
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
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
    public static void main(String[] args)
    {
        Dll_insertLast last = new Dll_insertLast();
        last.insertLast(1);
        last.insertLast(2);
        last.insertLast(3);
        last.insertLast(4);
        last.insertLast(5);

        last.displayForward();
    }   
}
