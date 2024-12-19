package recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean ppp(int n,int x)
    {
        if(n%x == 0)
        {
            return false;
        }
        if(x==1)
        {
            return true;
        }
        if(n<=1)
        {
            return false;
        }
        return ppp(n,x-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ppp(n,n-1));
    }
}


