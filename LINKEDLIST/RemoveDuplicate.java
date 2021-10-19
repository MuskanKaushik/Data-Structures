public class RemoveDuplicate {
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
    
    public void removeDup()
    {
        if(head == null)
        {
            return;
        }
        Node current = head;
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
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

    public static void main(String[] args)
    {
        RemoveDuplicate r = new RemoveDuplicate();
        RemoveDuplicate.head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);

        RemoveDuplicate.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Given Sorted Linked List :");
        r.display(head);
        System.out.println();
        System.out.println("Linked List after removal of duplicate nodes :");
        r.removeDup();
        r.display(head);
    }    
}
