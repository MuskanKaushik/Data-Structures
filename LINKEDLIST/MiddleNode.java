public class MiddleNode {
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

    public Node getMiddleNode()
    {
        if(head == null)
        {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
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
       MiddleNode m = new MiddleNode();
        MiddleNode.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        MiddleNode.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Given Linked List :");
        m.display(head);

        System.out.println();
        System.out.println("Middle Node is - " + m.getMiddleNode().data);
       
    }
    
}
