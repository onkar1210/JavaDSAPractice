package DSA;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!= b.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<a.length(); i++){
            Character currnChar = Character.toLowerCase(a.charAt(i));
            if(!map.containsKey(currnChar)) {
                map.put(currnChar, 1);
            } else {
                int x = map.get(currnChar);
                map.put(currnChar, x+1);
            }
        }

        for(int i=0; i<b.length(); i++){
            Character currnChar = Character.toLowerCase(b.charAt(i));

            if(!map.containsKey(currnChar)){
                return false;
            }

            int x = map.get(currnChar);
            map.put(currnChar, x-1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}