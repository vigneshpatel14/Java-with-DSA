/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to
find the Kth smallest element in the given array. It is given that all array elements are
distinct*/



package ARRAYS.OneDarray;

import java.util.Scanner;
import java.util.*;

public class KthSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        System.out.println(a[k-1]);
    }
}
