import java.util.*;

public class SelectionSort {
    public void Selection(int[] arr,int n){
        int min, temp;
        for(int i=0; i<n; i++)
        {
            min = i;
            for(int j = i+1; j<n; j++)
            {
                while(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SelectionSort ss = new SelectionSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ss.Selection(arr, n);
        for(int i=0;i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
