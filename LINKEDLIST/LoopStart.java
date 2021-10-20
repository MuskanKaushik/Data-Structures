public class LoopStart {
    Node head;
    public static class Node{
        Node next;
        int data;

        Node(int d)
        {
            this.next = null;
            this.data = d;
        }
    }

    public Node getStartNode(Node slowPtr){
        Node temp = head;
        while(temp != slowPtr)
        {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp; //starting Node of the loop
    }

    public Node startNode(){
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr)
            {
                return getStartNode(slowPtr);
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        LoopStart l = new LoopStart();
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

         System.out.println(l.startNode().data);
    }   
}
