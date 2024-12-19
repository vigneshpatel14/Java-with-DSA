package pending;

import java.util.Scanner;

public class Reverse_Array {
    static int[] RA(int[] a)
    {
        int n=a.length;
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            a[i]+=a[j];
            a[j]=a[i]-a[j];
            a[i]-=a[j];
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
        RA(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }

    }
}
