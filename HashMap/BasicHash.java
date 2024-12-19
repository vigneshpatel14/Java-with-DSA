package HashMap;

import java.util.HashMap;
import java.util.Map;

public class BasicHash {


    static  void HashMapMethods()
    {
        //Person age
        //Key , value data type can be anything
        Map<String , Integer> mp = new HashMap<>();
        //HashMap ni kuda ivachu instead of Map
        mp.put("Akash" , 21);
        mp.put("Yash" , 16);
        mp.put("Lav" , 17);
        mp.put("Rishika" , 18);
        mp.put("Harry" , 18);
        //To get value
        System.out.println(mp.get("Yash"));
        //Leni key iste null ostadi
        System.out.println(mp.hashCode());
        //Lets Update values
        mp.put("Akash" , 25);
        System.out.println(mp.get("Akash"));

        //To remove

        System.out.println(mp);
        System.out.println(mp.remove("Akash"));

        System.out.println(mp.remove("Riya"));
        System.out.println(mp);

        //If key exists then it removes else returns null


        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));

        mp.putIfAbsent("Yash" , 30);
        // same if(!mp.containsKey(("Yash"))) mp.put("Yash" , 30);
        //If not exists ayte ne implement ayte put chyeali leakpoteit replaces old one
        mp.putIfAbsent("Yashika" , 30);

        //All keys
        System.out.println(mp.keySet());
        //All values
        System.out.println(mp.values());
        //All enteries kavali ante
        System.out.println(mp.entrySet());


        for(String key : mp.keySet())
        {
            System.out.println("Age of " + key + " : " +mp.get(key));
        }

        System.out.println("\n\n");


        for(Map.Entry<String , Integer> e : mp.entrySet())
        {
            //ANte ah for each lo unadi map.entrySet() oka data type
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
            //Printf use cheste c program lo unatlu access cheyachu
         }

        //Ila kuda cheyachu in new version
        System.out.println("\nAnte Data type adhe ichukuntadi var ante\n");

        for (var e : mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
        }

    }



    public static void main(String[] args) {
        HashMapMethods();
    }
}
