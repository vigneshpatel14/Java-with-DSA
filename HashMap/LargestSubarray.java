package HashMap;

import java.util.HashMap;

public class LargestSubarray {
    int zeroSumLargestSubarray(int[] arr , int n)
    {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int maxlen = 0 , prefSum = 0;
        mp.put(0 , -1);
        for( int i = 0 ;i< arr.length ; i++)
        {
            prefSum += arr[i];
            if(mp.containsKey(prefSum))
            {
                maxlen = Math.max(maxlen , i - mp.get(prefSum));
            }
            else {
                mp.put(prefSum , i);
            }
        }
        return maxlen;
    }
}
