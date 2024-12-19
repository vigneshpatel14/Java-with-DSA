package Sorting;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Array_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"String","apple","Apple","aaple"};
        sort(arr);
        for(String i :arr)
        {
            System.out.print(i+" ");
        }
    }
    static void sort(String[] arr)
    {
        int n = arr.length;
        for(int i = 0;i<n-1;i++)
        {
            int min_idx = i;
            for(int j = i+1;j<n;j++)
            {
                if(arr[j].compareTo(arr[min_idx])<0)
                {
                    min_idx = j;
                }
            }
            //swap
            String temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}