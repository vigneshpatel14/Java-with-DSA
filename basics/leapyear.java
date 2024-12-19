package basics;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int x;
        x = sc.nextInt();
        if( x%4==0 || x%400==0)
        {
            System.out.println(x+"IT IS A LEAP YEAR");
        }
        else
        {
            System.out.println(x+"IT IS NOT A LEAP YEAR");
        }
    }
}
