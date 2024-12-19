//Q3 - Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
//if every diagonal from top-left to bottom-right has the same elements.



package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class Every_Diagonal_Same {
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
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(a[i][j]!=a[i-1][j-1])
                {
                    System.out.print(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
