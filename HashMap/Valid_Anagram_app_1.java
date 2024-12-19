package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram_app_1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        Map<Character , Integer> mp1 = makeFreq(s);
        Map<Character , Integer> mp2 = makeFreq(t);
        return mp1.equals(mp2);

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
