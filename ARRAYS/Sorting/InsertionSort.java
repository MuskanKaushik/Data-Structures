import java.util.*;

public class InsertionSort {
    public void insertion(int[] arr,int n)
    {
        int temp,j;
        for(int i=1;i<n;i++)
        {
            temp =arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        InsertionSort is = new InsertionSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        is.insertion(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }   
}
