public class RemoveNode {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.next = null;
            this.data = d;
        }
    }

    public void deleteNode(int key)
    {
        Node current = head;
        Node temp = null;

        if(current!=null && current.data == key)
        {
            head = current.next;
            return;
        }
        while(current!=null && current.data!=key)
        {
            temp = current;
            current = current.next;
        }
        if(current == null)
        {
            return;
        }
        temp.next = current.next;
    }

    public void display()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" NULL ");
    }

    public static void main(String[] args)
    {
        RemoveNode r = new RemoveNode();
        r.head = new Node(1);
        Node second = new Node(8);
        Node third = new Node(10);
        Node fourth = new Node(11);
        Node fifth = new Node(16);

        r.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        r.display();
        System.out.println();
        r.deleteNode(8);
        r.display();
    }
    
}
