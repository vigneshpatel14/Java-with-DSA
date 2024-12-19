package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class matrix_multiplication {
    static void muliply(int[][] a,int r1,int c1,int [][] b,int r2,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("NOT POSSIBLE");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
           for(int j=0;j<r2;j++)
           {
               for (int k=0;k<c1;k++)
               {
                   mul[i][j]+=(a[i][k]*b[k][j]);
               }
           }
        }
        System.out.println("--------------------");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st Array size");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter 1st array elements");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("2nd Array size");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter 2nd array elements");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        muliply(a,r1,c1,b,r2,c2
        );
    }
}
