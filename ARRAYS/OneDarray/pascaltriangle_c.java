package ARRAYS.OneDarray;

import java.util.Scanner;

public class pascaltriangle_c {
    static int combination(int n,int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    static int factorial(int k)
    {
        int fact=1;
        for (int i=2;i<=k;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int p=n/2;
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
    }
}
