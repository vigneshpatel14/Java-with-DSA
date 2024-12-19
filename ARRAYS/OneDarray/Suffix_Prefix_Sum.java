package ARRAYS.OneDarray;

import java.util.Scanner;

public class Suffix_Prefix_Sum {
    static boolean equalsumpartion(int[] arr)
    {
        int totalsum=0;
        for (int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }
        int prefixsum=0,suffixsum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefixsum+=arr[i];
            suffixsum=totalsum-prefixsum;
            if (prefixsum==suffixsum)
                return true;

        }
        return false;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Equal partion is: "+equalsumpartion(a));
    }
}
