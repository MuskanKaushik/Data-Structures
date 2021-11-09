import java.util.NoSuchElementException;

public class Dll_deletionFirst {
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
        
        Dll_deletionFirst(){
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
    
        public void deleteFirst()
        {
           if(isEmpty())
           {
               throw new NoSuchElementException();
           }
           Node temp = head;
           if(head == tail)
           {
               tail = null;
           }
           else
           {
               head.next.previous = null;
           }
           head = head.next;
           temp.next = null;
        }
        public static void main(String[] args)
        {
            Dll_deletionFirst dll = new Dll_deletionFirst();
            dll.insertFirst(1);
            dll.insertFirst(2);
            dll.insertFirst(3);
            dll.insertFirst(4);
            dll.insertFirst(5);
            
            dll.deleteFirst();
            dll.deleteFirst();
    
            dll.displayForward();
        }
}  
