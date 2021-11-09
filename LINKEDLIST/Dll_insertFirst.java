public class Dll_insertFirst {

    Node head;
    Node tail;
    int length;

    public class Node
    {
        int data;
        Node next;
        Node previous;

        Node(int d)
        {
            this.data = d;
        }
    }
    
    Dll_insertFirst(){
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

    public void displayBackward()
    {
        if(tail == null)
        {
            return;
        }

        Node current = tail;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.print(" NULL ");
    }

    public void insertFirst(int value)
    {
        Node newNode = new Node(value);
        if(isEmpty())
        {
            tail = newNode;
        }
        else
        {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public static void main(String[] args)
    {
        Dll_insertFirst dll = new Dll_insertFirst();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);

        dll.displayForward();
        System.out.println();
        dll.displayBackward();
    }
}
