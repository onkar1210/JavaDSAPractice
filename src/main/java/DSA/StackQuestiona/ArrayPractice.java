package DSA.StackQuestiona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
    public static void main(String args[]){
        Integer[] arr = {1,6,3,8,5,6,7,8,9};
        Arrays.sort(arr);
        for(int x : arr){
            System.out.println(x);
        }

        //convert array to arraylist
        ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(arr));
        List list = new ArrayList<>(List.of(arr));

        System.out.println(list.size());

        String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};

        List<String> al = new ArrayList<>(Arrays.asList(geeks));
        System.out.println(al.size());

        System.out.println("==================================");

        int[][] multi = {{1,2},{2,3},{3,4}};
        System.out.println(multi.length);
        System.out.println(multi[0].length);


    }
}
