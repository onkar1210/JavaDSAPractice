package DSA;

import java.util.HashSet;
import java.util.Set;

public class StringPractice {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("a.ba.v");
        str.deleteCharAt(0);
        String a = str.toString();
        str.deleteCharAt(0);
        str.indexOf("@");
        a.contains("a");
        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
    }
}
