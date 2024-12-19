//Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
//a) All the elements in the diagonals of the matrix are non-zero integers.
//b) All other elements except the diagonal elements are 0.
//Given a 2D integer array grid of size n*n representing a square matrix, return true if the grid is a perfect matrix.
//Otherwise, return false.



package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class Diagonals_NonZero {
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j == n-1)
                {
                    if (a[i][j]==0)
                    {
                        System.out.println(false);
                        return;
                    }
                }
                else
                {
                    if (a[i][j]!=0)
                    {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(true);
    }
}
