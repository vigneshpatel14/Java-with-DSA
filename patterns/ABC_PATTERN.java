package patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ABC_PATTERN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 65,num=0;
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            num=0;
            for(int j = n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k = 0 ;k<(i*2)-1;k++)
            {
                System.out.print((char)(a+num++));
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++)
        {
            num=0;
            for(int j = 0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k = (n-i)*2-1 ; k>0;k--)
            {
                System.out.print((char)(a+num++));
            }
            System.out.println();
        }
    }
}
