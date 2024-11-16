package DSA;

import org.example.Main;

public class PreProduct {
    //product of array without current index.
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[5];
        int preProduct = 1;
        int postProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i!=0){
                arr1[i] = preProduct * arr[i-1];
                preProduct = arr1[i];
            }else{
                arr1[i] = preProduct;
            }
        }
        for (int j = arr.length-1 ; j >= 0 ; j--) {
            if(j != arr.length-1){
                arr1[j] = postProduct * arr1[j];
                postProduct = postProduct * arr[j];
            }else{
                arr1[j] = postProduct * arr1[j];
                postProduct = postProduct * arr[j];
            }
        }
        Main.printArray(arr1);
    }
}
