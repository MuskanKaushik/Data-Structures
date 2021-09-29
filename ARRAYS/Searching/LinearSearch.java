import java.util.*;

public class LinearSearch {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int f = 0;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(key == arr[i])
            {
                System.out.println("Key found at index "+i);
                f = 1;
                break;
            }
        }
        if(f == 0)
        {
            System.out.println("Key not found");
        }

    }


  
    
}
