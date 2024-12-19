package pending;

import java.util.Scanner;

public class transpose_inplace {
    static void transposein(int[][] a,int r,int c)
    {
        for(int i=0;i<c;i++)
        {
            for (int j=i;j<r;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
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
        transposein(a,r,c);
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
