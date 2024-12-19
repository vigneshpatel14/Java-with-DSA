package recursion;

import java.util.Scanner;

public class ReturnFromUPPER_CASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pip(s, 0));
    }

    public static String pip(String s, int idx)
    {
        if(idx==s.length())
            return "";
        if(Character.isUpperCase(s.charAt(idx)))
        {
            return s.substring(idx);
        }
        return pip(s,idx+1);
    }
}
