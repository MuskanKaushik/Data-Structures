public class NthLastNode {
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

    public Node lastNthNode(int n){
        if(head == null)
        {
            return null;
        }

        if(n<=0)
        {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }
        Node refPtr = head;
        Node mainPtr =  head;
        int count = 0;
        while(count < n)
        {
            if(refPtr == null)
            {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        
        while(refPtr!=null)
        {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args)
    {
        NthLastNode n = new NthLastNode();
        NthLastNode.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        NthLastNode.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        n.display(head);
        System.out.println();
        System.out.println("Nth Node from the last is --> "+ n.lastNthNode(2).data);
    }   
}
