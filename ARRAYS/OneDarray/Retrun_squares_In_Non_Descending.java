package ARRAYS.OneDarray;

import java.util.Scanner;

public class Retrun_squares_In_Non_Descending {
    static int[] sort(int[] a)
    {
        int n=a.length;
        int[] ans=new int[n];
        int l=0,r=n-1;
        int k=n-1;
        while(l<=r)
        {
            if(Math.abs(a[l])>Math.abs(a[r]))
            {
                ans[k--]=a[l]*a[l];
                l++;
            }
            else
            {
                ans[k--]=a[r]*a[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] ans= sort(a);
        for (int i=0;i<n;i++)
        {
            System.out.print(ans[i]+"\t");
        }
    }
}
