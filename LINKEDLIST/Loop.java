public class Loop {
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

    public boolean containsLoop()
    {
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Loop l = new Loop();
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        l.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;

        System.out.println(l.containsLoop());
    }   
}
