package Loops;

import java.util.Scanner;

public class Armstrong_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++)
        {
            int c = i;
            int sum = 0;
            while(c>0)
            {
                int r = c%10;
                sum += Math.pow(r,3);
                c/=10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
