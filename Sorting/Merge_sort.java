package Sorting;

import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,5,0,0,4};
        mergesort(arr,0, arr.length - 1);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void mergesort(int[] arr,int l , int r)
    {
        if(l>=r)
            return;
        int mid = (l+r)/2;

        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l , mid, r);
    }


    static void merge(int[] arr , int l , int mid , int r)
    {
        int  n1 = mid-l+1;
        int  n2 =  r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0;i<n1;i++)
            left[i] = arr[i+l];
        for(int j = 0;j<n2;j++)
            right[j] = arr[mid+j+1];

        int i  = 0,j = 0,k = l;

        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
                arr[k++] = left[i++];
            else
            {
                arr[k++]= right[j++];
            }
         }
        while (i<n1)
            arr[k++] = left[i++];

        while (j<n2)
            arr[k++] = right[j++];
    }

}