package ARRAYS.OneDarray;
import java.util.ArrayList;
public class Reverse_ArrayList {
    static void reverselist(ArrayList<Integer> list)
    {
        int i=0,j=list.size()-1;
        while (i<j)
        {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        reverselist(List);
        System.out.println(List);
    }

}
