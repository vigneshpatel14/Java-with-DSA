package ARRAYS.OneDarray;

import java.util.Scanner;

public class secondmax
{
    static int second(int[] arr)
    {
        int m=Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        int k=Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++)
        {
            if(arr[i]<m && arr[i]>k)
            {
                k=arr[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(second(a));
    }

}

