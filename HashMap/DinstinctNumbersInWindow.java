package HashMap;

import java.util.HashMap;

public class DinstinctNumbersInWindow {
    static void count(int[] arr , int k)
    {
        HashMap<Integer , Integer> mp = new HashMap<>();
        for( int i = 0 ;i< k ;i++)
        {
            mp.put(arr[i] , mp.getOrDefault(arr[i] , 0) + 1);
        }

        System.out.println(mp.size());

        for( int i = k ;i< arr.length;i++)
        {
            if(mp.get(arr[i - k]) == 1)
            {
                mp.remove(arr[i - k]);
            }
            else {
                mp.put(arr[i - k] , mp.getOrDefault(arr[i - k] , 0) - 1);
            }
            mp.put(arr[i] , mp.getOrDefault(arr[i] , 0)  + 1);
            System.out.println(mp.size());
        }
    }
}
