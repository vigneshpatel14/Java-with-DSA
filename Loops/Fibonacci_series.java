package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci_series {
    public static void Fibo(int n)
    {
        //1 1 2 3 5 8
        int a = 0,b = 1;
        while(n-->0){
            System.out.print(a+"\t");
            int k = a+b;
            a=b;
            b=k;


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibo(n);
    }
}
