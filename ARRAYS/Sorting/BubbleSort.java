import java.util.*;

public class BubbleSort {

    public void bSort(int[] arr, int n)
    {
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    BubbleSort bs = new BubbleSort();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    bs.bSort(arr,n);
    for(int j=0;j<n;j++)
    {
        System.out.print(arr[j]+" ");
    }     
    }
}
