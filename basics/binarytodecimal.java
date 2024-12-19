package basics;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int ans=0,r,k=1;
        while(x>0)
        {
            r=x%10;
            ans= ans + r*k;
            k*=2;
            x/=10;
        }
        System.out.println(ans);
    }
}
