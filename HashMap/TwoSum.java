package HashMap;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums , int target)
    {
        int n = nums.length;
        int[] ans = {-1};
        //Value , index
        HashMap<Integer , Integer> mp = new HashMap<>();

        for( int i = 0 ; i < n ;i++)
        {
            int cc = target - nums[i];
            if(mp.containsKey(cc))
            {
                ans = new int[] { i , mp.get(cc)};
                return ans;
            }

            mp.put(nums[i], i );
        }

        return ans;
    }
}
