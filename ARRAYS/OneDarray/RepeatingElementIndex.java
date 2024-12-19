/*Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -18/

 */
package ARRAYS.OneDarray;

import java.util.Scanner;

public class RepeatingElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1;i<=n;i++)
        {
            a[i] = sc.nextInt();
        }
        boolean c = false;
        for(int i = 1;i<=n;i++)
        {
            for(int j = i+1;j<=n;j++)
            {
                if(a[i]==a[j]) {
                    System.out.println(i);
                    break;
                }
            }
            if(c) {

            }
        }
    }
}
