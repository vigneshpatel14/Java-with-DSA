package Sorting;

public class Zeroes_Ones_Twos {
    static  void sort(int [] arr)
    {
        int lo = 0,mid =0,hi = arr.length-1;
        while(mid<=hi)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,lo);
                mid++;
                lo++
                ;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    static void swap(int[] a,int i ,int j)
    {
        int temp =a[j];
        a[j] = a[i];
        a[i]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,0,1,0,0,0,0,2,2,2,2,2,1,0,1};
        sort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
