package Strings;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = "abcd";
//       System.out.println(str.substring(0,2)); // 2nd part excluded
//       System.out.println(str.substring(0,str.length())); // length 4 bcs last excluded valla motham string vastadi
//        System.out.println("---------------------------");
//        for( int i = 0;i<str.length();i++)
//       {
//           for (int j  = i+1;j<=str.length();j++)
//           {
//               System.out.print(str.substring(i,j)+" ");
//           }
//           System.out.println();
//       }

        //abcd ni akcd ki change cheyali ante

//        String k = str.substring(0,1) + "k" + str.substring(2);
//        //Arey waste ra idhi chala performance issues untai Immutabililty valla so
//        // we have stirng builders
//        System.out.println(k);
        String p = "pqrs";
        System.out.println(str.equals(p));
    }
}
