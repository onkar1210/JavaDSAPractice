package DSA;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,6,1,7,4,9};

        int n=3;

        System.out.println(search(arr, n));


    }

    public static int search(int[] arr, int n){
        Arrays.sort(arr);
        
        int start = 0 , end = arr.length-1;

        while (start < end) {
            int mid = (start + end)/2;
            if(n == arr[mid]){
                return mid;
            }else if(n < arr[mid]){
                end = mid - 1;
            }else if(n > arr[mid]){
                start = mid + 1;
            }
        }
        return 0;
    }
}
