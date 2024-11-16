package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(7);
        obj.add(7);
        obj.add(7);
        obj.add(7);
        obj.set(1, 9);
        obj.add(0,8);
        System.out.println(obj.contains(9));
        Collections.sort(obj);
        System.out.println(obj);

        System.out.println("=========================");

        Set<Integer> set = new HashSet<>(obj);
        for (int x: set){
            System.out.println(x);
        }
    }
}
