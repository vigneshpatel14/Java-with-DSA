package ARRAYS.OneDarray;

import java.util.Scanner;

public class spiral_matrix {
    static void spiral(int[][] matrix,int r,int c)
    {
        int tr=0,br=r-1,rc=c-1,lc=0;
        int t=0,k=r*c;
        while(t<k)
        {
            for(int i=lc;i<=rc && t<k;i++)
            {
                System.out.print(matrix[tr][i]+" ");
                t++;
            }
            tr++;
            for(int i=tr;i<=br && t<k;i++)
            {
                System.out.print(matrix[i][rc]+" ");
                t++;
            }
            rc--;
            for(int i=rc;i>=lc && t<k;i--)
            {
                System.out.print(matrix[br][i]+" ");
                t++;
            }
            br--;
            for(int i=br;i>=tr && t<k;i--)
            {
                System.out.print(matrix[i][lc]+" ");
                t++;
            }
            lc++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        spiral(matrix,r,c);

    }
}
