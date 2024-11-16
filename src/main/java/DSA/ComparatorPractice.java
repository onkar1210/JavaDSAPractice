package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorPractice {



    public static  void  main(String args[]){

      /*  Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(96);
        arr.add(61);
        arr.add(34);
        Collections.sort(arr, com);
        System.out.println(arr);   */

        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        ArrayList<String> arr=new ArrayList<>();
        arr.add("a");
        arr.add("am");
        arr.add("b");
        arr.add("Coder");
        Collections.sort(arr, com);
        System.out.println(arr);


    }


}
