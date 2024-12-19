/*Q4 - Given an unsorted array A of size N that contains
 only non-negative integers, find a
continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left
to right.
You need to print the start and end index of answer subarray*/

package ARRAYS.OneDarray;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayEqualsTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        int i = 0,j = 0,sum = 0;
        while (j<n) // length varaku loop run avutadi
        {
            sum+=a[j];
            if(sum>k)
            {
                while(sum>k && i<j)
                {
                    sum-=a[i];
                    i++;
                }
            }
            if(sum==k)
            {
                System.out.println(i + " " + j);
                break;
            }
            j++;
        }
    }
}
