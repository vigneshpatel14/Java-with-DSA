package Strings;

import java.util.Scanner;

public class String_Builders {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder("HELLO");
//        str.append(" WORLD");
//        System.out.println(str);
//        str.setCharAt(0,'M');
//        System.out.println(str);
//        str.insert(5,'-');
//        System.out.println(str);
//        str.deleteCharAt(5);
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
//        str.delete(5,11);
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
        StringBuilder str = new StringBuilder("Hello");
        str.append("World");
        System.out.println(str);
        //Here we can change the character

        str.setCharAt(0,'M');
        System.out.println(str);
        //Index at index

        str.insert(2,"sgf");
        System.out.println(str);

        str.insert(2,'-').insert(9,'-');
        System.out.println(str);

        str.deleteCharAt(3);
        System.out.println(str);
        str.delete(2,5);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        int k = str.length() - 1;
        for(int i = 0;i<str.length()/2;i++)
        {
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(k));
            str.setCharAt(k,temp);
            k--;
        }
        System.out.println(str);
    }
}
