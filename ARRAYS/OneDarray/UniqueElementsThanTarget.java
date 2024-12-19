/*Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
integer)*/

package ARRAYS.OneDarray;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementsThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count=0,j=0;
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int k = sc.nextInt();
        while(j<n)
        {
            count++;
            while(j<n-1 && a[j]==a[j+1])
            {
                j++;
            }
            j++;
        }
        if(count>=k)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
