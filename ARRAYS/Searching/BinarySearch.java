import java.util.*;

public class BinarySearch {

    public void search(int arr[], int first, int last, int key)
    {
        int mid = (first + last)/2;
        int flag = 0;

        while(first <= last)
        {
            if(key > arr[mid])
            {
                first = mid + 1;
            }
            else if(key == arr[mid])
            {
                System.out.println("Key found at index "+ mid);
                flag = 1;
                break;
            }
            else
            {
                last = mid-1;
            }

            mid = ((first+last)/2);
        }
        if(flag == 0)
        {
            System.out.println("key not found");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int last = n-1;

        bs.search(arr,0,last,key);    
    }
    
}
