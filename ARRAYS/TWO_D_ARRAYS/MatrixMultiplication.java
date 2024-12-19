package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class MatrixMultiplication {
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
    public static void mat(int[][] a,int[][] b,int m,int n,int r, int c)
    {
        if(n!=r)
        {
            return ;
        }
        int[][] res = new int[m][c];

        for(int i  =0;i<m;i++)
        {
            for(int j = 0;j<c;j++)
            {
                for(int k =0;k<n;k++)
                {
                    res[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }

        System.out.println("------------------------");
        printarr(res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[r][c];
        System.out.println("1st mat elements:");
        for(int i =0;i<m;i++)
        {
            for (int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("2st mat elements:");
        for(int i =0;i<r;i++)
        {
            for (int j = 0;j<c;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        mat(a,b,m,n,r,c);
    }
}