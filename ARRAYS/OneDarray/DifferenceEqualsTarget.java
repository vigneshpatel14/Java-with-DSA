/*Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
pair in the array whose absolute difference is exactly x.(n>1)*/
package ARRAYS.OneDarray;

import java.util.Scanner;

public class DifferenceEqualsTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            boolean check = false;
            for(int j =i+1 ;j<n;j++)
            {
                if(Math.abs(a[i]-a[j])==x)
                {
                    check = true;
                    System.out.println(a[i]+ " " +a[j]);
                    break;
                }
            }
            if(check)
            {
                System.out.println("YES");
            }
        }

    }
}


