//Q4 - Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.




package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class Diagonal_Traversal_EveryElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[] res= new int[m*n];
        int col = 0,row = 0,i = 0,j=0,idx = 0;
        while(col<m)
        {
            i = row;
            j = col;
            while(i>=0 && j<m)
            {
                res[idx++] = a[i][j];
                i--;
                j++;
            }
            row++;
            if(row>=n)
            {
                row = n -1;
                col++;
            }
        }
        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p]+" ");
        }
    }
}
