package Sorting;

import java.util.Scanner;

public class bub_sort {
    static void buble_Sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0 ;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        buble_Sort(arr);
        for(int k :arr)
        {
            System.out.print(k+ " ");
        }
    }


}
