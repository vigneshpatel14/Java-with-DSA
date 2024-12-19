package HashMap.HashSet;

import java.util.HashSet;

public class MaxNumbers {
    static  int maxNumbersOnTable(int[] bag)
    {
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for( int i : bag)
        {
            if(table.contains(i))
            {
                table.remove(i);
            }
            else {
                table.add(i);
                max = Math.max(max , table.size());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2 , 1, 1 , 3 , 2 , 3};
        System.out.println(maxNumbersOnTable(nums));
    }
}
