package ARRAYS.OneDarray;
import java.util.ArrayList;
import java.util.Collections;

public class String_ArrayList_Sorting {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("cric");
        s.add("add");
        s.add("s");
        Collections.sort(s);
        System.out.println(s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);
    }
}
