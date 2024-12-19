package ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class MATRIX_TRANSPOSE {
    static int[][] transpose(int[][] a,int r,int c)
    {
        int[][] ans =new int[c][r];
        for(int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                ans[i][j]=a[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter array elements");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int[][] ans = transpose(a,r,c);
        for (int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
