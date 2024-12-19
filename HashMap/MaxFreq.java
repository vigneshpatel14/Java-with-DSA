package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 5 ,1 , 4 , 5,5 ,5 , 6 , 4 ,4 ,4};

        Map<Integer , Integer> mp = new HashMap<>();
        for( int el : arr){
            if(! mp.containsKey(el))
            {
                mp.put(el , 1);
            }
            else {
                mp.put(el , mp.get(el) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int mxFreq = 0 , ansKey = -1;
        for( var e : mp.entrySet())
        {
            if(e.getValue() > mxFreq)
            {
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.printf("%d has Max Frequency and it occurs %d times " , ansKey , mxFreq);

        //Ila kuda traverse cheyachu

        for(var key : mp.keySet())
        {
            if(mp.get(key) > mxFreq)
            {
                mxFreq = mp.get(key);
                ansKey = key;
            }
        }

    }
}
