package ARRAYS.OneDarray;

import java.util.Arrays;
import java.util.Scanner;

public class clonearray_deepcopy {
    static void printarray(int[] arr)
    {
        for (int i = 0 ; i< arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
//        int[] arr_2 = a.clone();
//        printarray(arr_2);
        //one more way
        int[] arr_2 = Arrays.copyOf(a,a.length);
        //we can give (a,0, to upto size)
        printarray(arr_2);
    }
}
