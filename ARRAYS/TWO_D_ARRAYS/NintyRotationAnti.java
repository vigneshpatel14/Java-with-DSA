package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

//Ninty degree rotation in anti clock wise
public class NintyRotationAnti {
    public static void printarr(int[][] arr)
    {
        for (int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i =0;i<m;i++)
        {
            for (int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        rotate(a,m,n);
    }
    public static void rotate(int[][] a,int m  , int n)
    {
        for (int i = 0;i<m;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //Transpose Completed now reverse

        for (int i = 0;i<m/2;i++)
        {
                int temp[] = a[i];
                a[i] = a[n-1-i];
                a[n-1-i] = temp;
        }
        printarr(a);

    }
}
