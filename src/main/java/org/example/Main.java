package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();


        arr.ensureCapacity(3);
        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i)+" "+arr.size());
        }

    }

    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}