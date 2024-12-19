package ARRAYS.OneDarray;

import java.util.Scanner;

public class Prefix_Sum {
    static int[] sum(int[] a)
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+a[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sum(a);
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
