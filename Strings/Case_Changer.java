package Strings;

import java.util.Locale;
import java.util.Scanner;

public class Case_Changer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        for(int i = 0;i<str.length();i++)
//        {
//            char ch = str.charAt(i);
//            if(ch==' ') {
//                continue;
//            }
//            int as = (int)ch;
//            if (as >= 97) {
//                ch =  (char)(as - 32);
//             str.setCharAt(i,ch);
//            }
//            if (as >= 65 && as<97) {
//                ch =  (char)(as + 32);
//                str.setCharAt(i,ch);
//            }
//        }
//        System.out.println(str);

        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            int as = (int) ch;
            if (as >= 97) {
                ch = (char) (as - 32);
                str = str.substring(0, i) + ch + str.substring(i+ 1);
            }
            if (as >= 65 && as < 97) {
                ch = (char) (as + 32);
                str = str.substring(0, i) + ch + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }

}
