/*Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
missing number from the first N integers. There are no duplicates in the list*/

package ARRAYS.OneDarray;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        for(int i = 0;i<(n-1);i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean check = false;
        for(int i =0;i<(n-1);i++)
        {
            if(a[i]!=(i+1))
            {
                System.out.println(i);
                check = true;
                break;
            }
        }
        if(!check)
        {
            System.out.println();
        }

    }
}
