public class twoStacks {
    int[] stack;
    int size;
    int top1, top2;

    twoStacks(int n)
    {
        stack = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    public void push1(int item)
    {
        if(top1 < top2 -1)
        {
            top1++;
            stack[top1] = item;
        }
        else
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void push2(int item)
    {
        if(top1 < top2-1)
        {
            top2--;
            stack[top2] = item;
        }
        else
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1()
    {
        if(top1 >= 0)
        {
            int x = stack[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2()
    {
        if(top2 < size)
        {
            int x = stack[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        twoStacks ts = new twoStacks(5);
        ts.push1(10);
        ts.push2(50);
        ts.push2(40);
        ts.push1(20);
        ts.push2(30);

        System.out.println("Element popped from the stack 1 : " + ts.pop1());

        System.out.println("Element popped from the stack 2 : " + ts.pop2());

        System.out.println("Element popped from the stack 1 : " + ts.pop1());

        ts.push1(10);
    }    
}
