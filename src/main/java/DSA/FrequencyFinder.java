package DSA;

import java.util.HashMap;
import java.util.Map;

public class FrequencyFinder {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 4};

        Map<Integer, Integer> m = new HashMap<>();

        for (int x : arr) {
            m.put(x, m.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()%2 == 1){
                System.out.println(e.getKey());
            }
        }
    }
}
