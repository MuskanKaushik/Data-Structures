import java.util.*;

public class Reverse {
    static Node head;
    public static class Node{
        Node next;
        int data;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }    

    public void display(Node head)
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" NULL ");
    }

    public Node reverseList(Node head)
    {
        Node current = head;
        Node previous = null;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public static void main(String[] args)
    {
        Reverse r = new Reverse();
        Reverse.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        Reverse.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Given Linked List :");
        r.display(head);
        System.out.println();
        System.out.println("Reverse Linked List :");
        head = r.reverseList(head);
        r.display(head);
    }
}
