package ARRAYS.OneDarray;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f=Float.valueOf(4.5f);
        System.out.println(f);
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1.get(1));
        for(int j=0;j<l1.size();j++)
        {
            System.out.println(l1.get(j));
        }
        System.out.println(l1);
        l1.add(1,100);
        System.out.println(l1);
        l1.set(1,10);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);
        boolean ans = l1.contains(Integer.valueOf(7)) & l1.contains(Integer.valueOf(6));
        System.out.println(ans);
        ArrayList l =new ArrayList<>();
        l.add("pip");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }

}
