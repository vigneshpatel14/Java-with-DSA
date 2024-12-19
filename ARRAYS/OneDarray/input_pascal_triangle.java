package ARRAYS.OneDarray;

import java.util.Scanner;

public class input_pascal_triangle {
    static int[][] spiral(int n)
    {
        int tr=0,br=n-1,rc=n-1,lc=0;
        int k=n*n;
        int[][] matrix = new int[n][n];
        int curr=1;
        while(curr<k)
        {
            for(int i=lc;i<=rc && curr<k;i++)
            {
                matrix[tr][i]=curr;
                curr++;
            }
            tr++;
            for(int i=tr;i<=br && curr<k;i++)
            {
                matrix[i][rc]=curr;
                curr++;
            }
            rc--;
            for(int i=rc;i>=lc && curr<k;i--)
            {
                matrix[br][i]=curr;
                curr++;
            }
            br--;
            for(int i=br;i>=tr && curr<k;i--)
            {
                 matrix[i][lc]=curr;
                curr++;
            }
            lc++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int[][] matrix = spiral(n);
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
