package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Vaid_Anagram_app2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        Map<Character , Integer> mp = makeFreq(s);
        for( int i = 0 ;i < t.length() ; i++)
        {
            Character ch = t.charAt(i);
            if( !mp.containsKey(ch))
            {
                return false;
            }
            int currFreq = mp.get(ch);
            if(currFreq == 0)
            {
                return false;
            }
            mp.put(ch , currFreq -1);

        }

        for(Integer i : mp.values())
        {
            if( i != 0)
            {
                return false;
            }
        }

        return true;
    }

    static HashMap<Character , Integer> makeFreq(String str)
    {
        HashMap<Character , Integer > mp = new HashMap<>();
        for( int i = 0 ; i < str.length() ; i++)
        {
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch , 1);
            }
            else
            {
                int currFreq = mp.get(ch);
                mp.put(ch , currFreq + 1);
            }
        }

        return mp;
    }
}
