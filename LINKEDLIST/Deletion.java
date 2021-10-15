public class Deletion {

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

    public Node deletefirst()
    {
        if(head == null)
        {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deletelast()
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node current = head;
        Node previous = null;
        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteposition(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            Node previous = head;
            int count = 1;
            while(count < position - 1 )
            {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }
    }
    
    public void display(Node head)
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
        Deletion d = new Deletion();
        Deletion.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        Deletion.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Given Linked List : ");
        d.display(head);
        System.out.println();

        System.out.println("Deleted Node : ");
        System.out.println(d.deletefirst().data);
        System.out.println("Linked List after Deletion : ");
        d.display(head);
        
        System.out.println();
        System.out.println("Deleted Node : ");
        System.out.println(d.deletelast().data);
        System.out.println("Linked List after Deletion : ");
        d.display(head);

        System.out.println();
        d.deleteposition(3);
        System.out.println("Linked List after Deletion from given position : ");
        d.display(head);
        
    }   
}
