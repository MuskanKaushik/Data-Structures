public class Queue {
    int[] queue;
    int front;
    int rear;
    int capacity;
    int count;

    Queue(int size)
    {
        capacity = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public int size()
    {
        return count;
    }

    public boolean isFull()
    {
        return (size() == capacity);
    }

    public boolean isEmpty()
    {
        return (size() == 0);
    }

    public void enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            System.exit(1);
        }
        System.out.println("Inserting element : "+ item);
        rear = (rear+1) % capacity;
        queue[rear] = item;
        count++;      
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        System.out.println("Removing element: "+ queue[front]);
        front = (front+1)%capacity;
        count--;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            System.exit(1);
        }
        return queue[front];
    }
    public static void main(String[] args)
    {
        Queue q = new Queue(5); //Queue with a capacity of 5

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println();

        System.out.println("Top element : " + q.peek());
        System.out.println();

        q.dequeue();
        q.dequeue();
        System.out.println();

        System.out.println("Top element : " + q.peek());
        System.out.println();

        q.dequeue();
        System.out.println();

        System.out.println("Top element : " + q.peek());
        System.out.println();
        
        q.dequeue();
        q.dequeue();
        System.out.println();

        if(q.isEmpty())
        {
            System.out.println("Queue is Empty now");
        }
        else
        {
            System.out.println("Queue is not empty");
        }
    }    
}
