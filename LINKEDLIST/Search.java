public class Search {
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

    public boolean find(Node head,int key){
        if(head == null)
        {
            return false;
        }

        Node current = head;
        while(current != null)
        {
            if(current.data == key)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Search s = new Search();
        Search.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        Search.head.next = second;
        second.next = third;
        third.next = fourth;
        s.display(head);
        System.out.println();

        if(s.find(head, 3)){
            System.out.println("Search key found");
        }
        else
        {
            System.out.println("Search key not found");
        }
    }
    
}
