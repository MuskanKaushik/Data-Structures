//insert a node in a sorted singly linked list

public class insertNode {
    Node head;

    public static class Node{
        Node next;
        int data;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public Node insertion(int value)
    {
        Node newNode = new Node(value);
        if(head == null)
        {
            return newNode;
        }

        Node current = head;
        Node temp = null;

        while(current != null && current.data < newNode.data)
        {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
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
        insertNode in = new insertNode();
        in.head = new Node(1);
        Node second = new Node(8);
        Node third = new Node(10);
        Node fourth = new Node(16);

        in.head.next = second;
        second.next = third;
        third.next = fourth;

        in.display();
        in.insertion(9);
        System.out.println();
        in.display();
    }
}
