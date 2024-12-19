package Strings;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder gtr = str.reverse();
        if(str.compareTo(gtr) == 0)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}
