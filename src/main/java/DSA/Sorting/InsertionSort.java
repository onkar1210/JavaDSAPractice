package DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3,5,7,2,3,5};

        for(int i = 1 ; i < arr.length ; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for(int x : arr){
            System.out.println(x);
        }

    }
}
