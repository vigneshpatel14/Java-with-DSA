package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class transpose_inplace {
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    static void findtranspose(int[][] matrix,int r ,int c) {
//        int r = matrix.length;
//        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and columns");
        int r= sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix= new int[r][c];
        System.out.println("enter elements");
        for (int i = 0;i<r;i++)
        {
            for (int j =0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printmatrix(matrix);
        System.out.println("transpose");
        findtranspose(matrix,r,c);
        printmatrix(matrix);
    }
}
