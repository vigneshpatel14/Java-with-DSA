package Strings;

import java.util.Scanner;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                sb.append(ch);
            }
            else
            {
                sb.reverse();
                ans += sb;
                ans+=" ";
                sb.delete(0,sb.length());
            }
        }
        sb.reverse();
        System.out.println(ans);
    }
}
