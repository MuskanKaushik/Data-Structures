public class RemoveLoop {
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
    
        public void breakLoop(Node slowPtr){
            Node temp = head;
            while(temp.next != slowPtr.next )
            {
                temp = temp.next;
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;
        }
    
        public void rLoop(){
            Node fastPtr = head;
            Node slowPtr = head;
    
            while(fastPtr!=null && fastPtr.next!=null)
            {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
    
                if(fastPtr == slowPtr)
                {
                    breakLoop(slowPtr);
                    return;
                }
            }
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
            RemoveLoop l = new RemoveLoop();
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

            l.rLoop();
            l.display();   
        }   
}
    
