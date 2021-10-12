import java.util.*;

public class Insertion {

    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public void insertfirst(int n)
    {
        Node ptr = new Node(n);
        ptr.next = head;
        head = ptr;
    }

    public void insertEnd(int n)
    {
        Node ptr = new Node(n);
        if(head == null)
        {
            head = new Node(n);
        }

        Node e = head;
        while(e.next != null)
        {
            e = e.next;
        }
        e.next = ptr;
    }

    public void insertAfter(Node p_node, int n)
    {
        Node ptr = new Node(n);
        if(p_node == null)
        {
            System.out.println("No previos node exists. ");
        }
        ptr.next = p_node.next;
        p_node.next = ptr;
    }

    public void insertAt(int n, int pos)
    {
        Node ptr = new Node(n);
        Node current = head;
        int count = 1;
        while(current != null && count<pos)
        {
            current = current.next;
            count = count+1;
        }
        ptr.next = current.next;
        current.next = ptr;
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
    public static void main(String[] args)
    {
        Insertion in = new Insertion();
        Insertion.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        Insertion.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Given Linked List : ");
        in.display(head);

        System.out.println();
        System.out.println("Inserting a node at first : ");
        in.insertfirst(0);
        in.display(head);

        System.out.println();
        System.out.println("Inserting a node at end : ");
        in.insertEnd(60);
        in.display(head);

        System.out.println();
        System.out.println("Inserting a node after any node : ");
        in.insertAfter(in.head.next , 15);
        in.display(head);

        System.out.println();
        System.out.println("Inserting a node at a particular position : ");
        in.insertAt(25,4);
        in.display(head);
    }    
}
