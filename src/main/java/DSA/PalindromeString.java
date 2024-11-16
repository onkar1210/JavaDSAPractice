package DSA;

import java.util.*;

public class PalindromeString extends Parent {

    public PalindromeString() {
        System.out.println("PalindromeString");
    }

    public PalindromeString(String str) {
        super(str);
        System.out.println("PalindromeString" + str);

    }

    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString("Hello");

        String  str = "nitin";


        int start = 0 , end = str.length()-1;
        while(start<end){
            if(str.charAt(start) == str.charAt(end)) {

            }
            else{
                System.out.println("its not a palindrome");
                break;
            }
            end--;
            start++;
        }
        System.out.println("its a palindrome");

    /*    int[] arr = {1, -3, -6, 0, -1, -1};

        int start=0, end=arr.length-1;
        while(start<end){
            while(arr[start]<0 && start<end){
                start++;
            }while(arr[end]>=0 && start<end){
                end--;
            }
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        for(int x:arr){
            System.out.println(x);
        }
        */
    }
}

class Parent {

    public Parent(String str) {
        System.out.println("Parent" + str);
    }

    public Parent() {
        System.out.println("Parent");
    }

}