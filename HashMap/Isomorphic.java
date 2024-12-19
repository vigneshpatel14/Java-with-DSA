package HashMap;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s , String t)
    {
        HashMap<Character , Character> mp = new HashMap<>();
        for(int i = 0; i < s.length() ; i++)
        {
            Character sch = s.charAt(i);
            Character tch = s.charAt(i);
            if(mp.containsKey(sch))
            {
                if(mp.get(sch) != tch)
                {
                    return false;
                }
            } else if (mp.containsValue(tch)) {
                return false; //Ante oke key ki 2 values undadhu

            } else {
                mp.put(sch , tch);
            }
        }
        return true;
    }
}
