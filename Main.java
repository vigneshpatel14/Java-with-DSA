import java.util.ArrayList;
import java.util.List;

class Main{
    public static List<String> find_permutation(String s) {
        // Code here

        List<String> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        boolean[] isvalid = new boolean[s.length()];
        helper(s , ds , isvalid , ans);
        return ans;
    }


    private static void helper(String s , List<String> ds , boolean[] isvalid , List<String> ans)
    {
        if(ds.size() == s.length())
        {
            String k = "";

            for( int i = 0 ; i < ds.size() ; i++)
            {
                k += ds.get(i);
            }
            if(!ans.contains(k)){
                 ans.add(k);
            }
            k = "";

        }


        for( int i = 0 ; i< s.length() ; i++)
        {
            if(!isvalid[i])
            {
                ds.add(s.substring(i, i +1));
                isvalid[i] = true;
                helper(s , ds , isvalid , ans);

                //Now backtrack

                isvalid[i] = false;
                //Add chesnam ga now remove those
                ds.remove(ds.size() - 1);
            }
        }



    }

    public static void main(String[] args) {
        List<String> ans = find_permutation("ljr");
        System.out.println(ans.size());
        for( int i = 0 ; i< ans.size() ; i++)
        {
            System.out.println(ans.get(i));
        }
    }

}