package ARRAYS.OneDarray;

import java.util.Scanner;

public class Sum_In_Range {
    static int[] makeprefarray(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {

            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] prefsum = makeprefarray(a);
        System.out.println("Enter no. of queries");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.println("Enter Range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefsum[r]-prefsum[l-1];
            System.out.println(ans);
            q--;
        }
    }
}
