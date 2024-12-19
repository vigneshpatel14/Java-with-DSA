package Sorting;

public class Quick_Sort {
    static  int partition(int[] arr,int st,int end)
    {
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1;i<=end;i++)
        {
            if(arr[i]<=pivot)
            {
                cnt++;
            }
        }
        int pivot_idx = st+cnt;
        swap(arr,st,pivot_idx);
        int i = st, j = end;
        while(i<pivot_idx && j>pivot_idx)
        {
            while(arr[i]<=pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<pivot_idx && j> pivot_idx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_idx;

    }
    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    static void quicksort(int[] arr,int st,int end)
    {
        if(st>=end)
        {
            return;
        }
        int pi = partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,0,0,4};
        quicksort(arr,0, arr.length - 1);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
