package ARRAYS.OneDarray;

import java.util.Scanner;

public class unique_number {

    static void printarray(int[] arr)
    {
        for (int i = 0 ; i< arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    static int unq(int[] arr)
    {
        int n= arr.length;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    arr[i]=arr[j]=-1;
            }
        }
        for (int i=0;i<n;i++)
        {
            if (arr[i]>0)
                return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(unq(a));
    }

}
