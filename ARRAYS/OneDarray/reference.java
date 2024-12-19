package ARRAYS.OneDarray;

import java.util.Scanner;

public class reference {
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
        printarray(a);
        int[] arr_2=a;//this will just copies it's adress
        printarray(arr_2);
        System.out.println("\norginal array after changing");
        arr_2[1]=7;
        printarray(a);
        //same if we try this with int it doesn't changes
    }
}
