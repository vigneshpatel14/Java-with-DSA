package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {



    public static void main(String[] args) {

        String str = "abc";
        List<String> l = new ArrayList<>();
        printpermu(str , "" , l);
        for (int i = 0 ; i< l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }

    private static void printpermu(String str, String t , List<String> l) {
        if(str.equals(""))
        {
            //System.out.println(t);
            l.add(t);
            return;
        }
        for( int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i); //Ah char tiseyali ga
            String left = str.substring(0 , i ); //a
            String right = str.substring(i+1); //c
            String rem = left + right;
            printpermu(rem , t + ch , l);
        }
        //First 3 calls avali to remove single single characters
    }
}
