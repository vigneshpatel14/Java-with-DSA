package Loops;

import java.util.Scanner;

public class OneAsSumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isprime(n) && isprime(n-2))
        {
            System.out.print(true);
        }
        else
            System.out.println(false);
    }
    public static boolean isprime(int n)
    {
        for(int i =2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
