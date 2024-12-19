package ARRAYS.OneDarray;

import java.util.Scanner;

public class pascaltriangle_c_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int first=1;
            for (int j=0;j<=i;j++)
            {
                System.out.print(first);
                int k=(i-j)/(j+1);
                first = first * (k);
            }
            System.out.println();
        }
    }
}

