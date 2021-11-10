import java.util.NoSuchElementException;

public class Dll_DeletionLast {
    Node head;
    Node tail;
    int length;

    public class Node{
        Node next;
        Node previous;
        int data;

        Node(int d)
        {
            this.data = d;
            this.previous = null;
            this.next = null;
        }
    }

    Dll_DeletionLast()
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
            return ;
        }

        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(" NULL ");
    }

    public void deletionLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        Node temp = tail;
        if(head == tail)
        {
            head = null;
        }
        else
        {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
    }

    public void insertFirst(int value)
    {
        Node newNode = new Node(value);
        if(isEmpty())
        {
            tail = newNode;
        }
        else{
            head.previous = newNode;

        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public static void main(String[] args)
    {
        Dll_DeletionLast dll = new Dll_DeletionLast();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);
        
        dll.deletionLast();
        dll.deletionLast();

        dll.displayForward();
        System.out.println();

    }   
}
