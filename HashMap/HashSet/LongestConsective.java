package HashMap.HashSet;

import java.util.HashSet;

public class LongestConsective {
    public int longestConsective( int[] nums )
    {
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums )
        {
            st.add(num);
        }
        //Set loki anni  numbers add cheyali

        int maxl = 0;
        for(int num : st)
        {
            if(!st.contains(num - 1))
            {
                //Ante idhe starting point anamata
                int currNum = num; // 1
                int currStreak = 1;
                while(st.contains(currNum + 1))
                {
                    currStreak++;
                    currNum++; //2
                }

                maxl = Math.max(maxl , currStreak);
//                currStreak = 0; ela ayna paina one undi ga
            }
        }
        return  maxl;
    }
}
