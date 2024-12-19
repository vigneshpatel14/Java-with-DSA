//Q1. Given a matrix arr[][] of integers, print the prefix sum matrix for it.



package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class TwoD_Array_Prefix_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = a[i][j];
                if(i==0 && j==0)
                {
                    continue;
                } else if (i==0) {

                    mat[i][j] += mat[i][j-1];

                } else if (j==0) {

                    mat[i][j] += mat[i-1][j];
                }
                else
                {
                    mat[i][j]+=mat[i-1][j]+mat[i][j-1];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
