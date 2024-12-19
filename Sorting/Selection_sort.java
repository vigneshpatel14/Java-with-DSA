package Sorting;

import java.util.Scanner;

public class Selection_sort {
    static void sel(int[] a)
    {
        int n = a.length;
        for (int i =0;i<n-1;i++)
        {
            int min_index = i;
            for(int j = i+1;j<n;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index = j;
                }

            }
            if (min_index!=i)
            {
                int temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        sel(a);
        for(int k :a)
        {
            System.out.print(k+ " ");
        }
    }
}
