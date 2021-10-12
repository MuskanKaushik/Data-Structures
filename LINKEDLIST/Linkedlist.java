import java.util.*;

public class Linkedlist {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" NULL ");
    }
    
    public static void main(String[] args)
    {
        Linkedlist list = new Linkedlist();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.display();
    }
}
