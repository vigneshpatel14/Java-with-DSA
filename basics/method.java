package basics;

import java.util.Scanner;

class Algebra{
    int add(int a, int b)
    {
        return a+b;
    }
}
public class method {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(obj.add(x,y));
    }
}
