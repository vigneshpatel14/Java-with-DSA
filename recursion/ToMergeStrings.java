package recursion;

import java.util.Scanner;

public class ToMergeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        String  b = sc.nextLine();
        System.out.println(merge(a,b));
    }

    public static String merge(String a , String b)
    {
        String ans = "";

        if(a.length() == 0)
        {
            ans+=b;
            return ans;
        }
        if(b.length() == 0)
        {
            ans+=a;
            return ans;
        }
        ans+= a.substring(0,1);
        ans+= b.substring(0,1);

        ans+= merge(a.substring(1,a.length()),b.substring(1,b.length()));
        return ans;


    }

}
