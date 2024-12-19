package Sorting;

import java.util.Scanner;

public class Kth_smallest {
    static int sort(int[] arr, int k)
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,5,0,0,4};
        int k = 3;
        sort(arr,k);
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
        System.out.print("\n"+arr[k-1]);
    }
}
