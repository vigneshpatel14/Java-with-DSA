package Sorting;

public class Stable_Count_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,0,0,4};
        countsort(arr);
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
//    static void Basiccountsort(int[] arr)
//    {
//        int max = findmax(arr);
//        int[] count = new int[max+1];
//        for(int i = 0 ;i< arr.length;i++)
//        {
//            count[arr[i]]++;
//        }
//        int k = 0;
//        for(int i = 0;i< count.length;i++)
//        {
//            for(int j = 0 ;j< count[i];j++)
//            {
//                arr[k++] = i;
//            }
//        }
//    }
    static void countsort(int[] arr)
    {
        int n = arr.length;
        int[] output = new int[10];
        int max = findmax(arr);
        int[] count = new int[max+1];
        for(int i = 0 ;i< arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i = 1;i< count.length;i++)
        {
            count[i] += count[i-1];
        }
        for(int i = n-1;i>=0;i--)
        {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for(int i = 0;i<n;i++)
        {
            arr[i] = output[i];
        }
    }
}
