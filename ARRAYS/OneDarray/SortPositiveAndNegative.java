package ARRAYS.OneDarray;

import java.util.Scanner;

public class SortPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0;i<n;i++)
        {
            if(a[i]>=0)
            {
                b[idx++]=a[i];
            }
        }
        for(int i = 0;i<n;i++)
        {
            if(a[i]<0)
            {
                b[idx++]=a[i];
            }
        }
        for(int i = 0 ;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}