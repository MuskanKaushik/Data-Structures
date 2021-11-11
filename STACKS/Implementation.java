import java.util.*;
public class Implementation {

    static Scanner sc = new Scanner(System.in);
    static int stack[], top = -1, size;

    static //static block executes when the class loads i.e. loads before the main method
    {
        create();
    }

    static void create()
    {
        System.out.print("Enter size of stack : ");
        size = sc.nextInt();
        stack = new int[size];
    }   

    static boolean isFull()
    {
        if(top == (size-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack overflow!");
        }
        else
        {
            stack[++top] = item; 
        }
    }

    static int pop()
    {
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            return stack[top--]; //Firstly, it will return stack[top] & then it will decrease the top (Post Decreasement).
        }
    }

    static int peek()
    {
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            return stack[top];
        }
    }

    static void traverse()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println();
            System.out.println("Elements of stack : ");
            for(int i=top; i>=0; i--)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int ch, item;
        while(true)
        {
            System.out.println();
            System.out.println("Below are the Chooses : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Quit");

            System.out.println();
            System.out.print("Enter your choice : ");
            ch = sc.nextInt(); //we are using classname because if there is any local variable defined as sc then the priority will be given to the local variable.                                    

            switch(ch)
            {
                case 1: System.out.print("Enter Element : ");
                        item = sc.nextInt();
                        push(item); 
                        break;

                case 2: item = pop();
                        if(item == 0)
                        {
                            System.out.println("Stack underflow! \n");
                        }
                        else
                        {
                            System.out.println("Popped item : "+item);
                        }
                        break;

                case 3: item = peek();
                        if(item == 0)
                        {
                            System.out.println("Stack underflow \n");
                        }
                        else
                        {
                            System.out.println("Peek item: "+item);
                        }
                        break;

                case 4: traverse();
                        break;

                case 5: System.exit(1); //Exit method is a static method available in a system class.

                default: System.out.println("This is an invalid choice.");
            }
        }
    }
}
