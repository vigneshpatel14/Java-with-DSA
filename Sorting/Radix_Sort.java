package Sorting;

public class Radix_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,0,0,4};
        Radixsort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int findmax(int[] arr)
    {
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]>mx)
            {
                mx=arr[i];
            }
        }
        return mx;
    }
    static void Radixsort(int[] arr)
    {
        int mx = findmax(arr);
        for(int place = 1; mx/place >0;place*=10)
        {
            countsort(arr,place);
        }
    }

    static void countsort(int[] arr,int place)
    {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0;i< arr.length;i++)
        {
            count[(arr[i]/place)%10]++;
        }
        for(int i = 1;i< count.length;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i = n-1;i>=0;i--)
        {
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i = 0;i<n;i++)
        {
            arr[i] = output[i];
        }
    }
}
