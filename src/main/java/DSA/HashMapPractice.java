package DSA;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put(1, "Onkar");
        map.put(2, "Priyanka");
        map.put(3, "Anita");
        map.put(4, "Lobhaji");
        map.put("Kahate", "Family");  //this is allowed since we haven't defined generic type of Key and Value

        System.out.println(map);

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1, "Onkar");
        map1.put(2, "Priyanka");
        map1.put(3, "Anita");
        map1.put(4, "Lobhaji");
       // map1.put("Kahate", "Family");  //this is not allowed since we have defined generic type of Key and Value

        System.out.println(map1);

        for(Map.Entry<Integer,String> e : map1.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(map1.size());

        if(map1.containsKey(1)){
            map1.remove(1);
        }

        System.out.println(map1.size());

        Set<Integer> keys = map1.keySet();
        for(Integer key: keys){
            System.out.println(key + " " + map1.get(key));
        }


    }
}
