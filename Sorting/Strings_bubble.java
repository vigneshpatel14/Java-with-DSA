package Sorting;

import java.util.Scanner;

public class Strings_bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"coding","is","fun","apple","Apple"};
        sort(arr);
        for(String i :arr)
        {
            System.out.print(i+" ");
        }
    }
    static void sort(String[] arr)
    {
        int n = arr.length;
        for(int i = 0 ;i<n-1;i++)
        {
            for(int j = 0 ;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
