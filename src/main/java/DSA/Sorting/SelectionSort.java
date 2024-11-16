package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3,5,7,2,3,5};

        for(int i = 0 ; i < arr.length - 1 ; i++){
            int smallest = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for(int x : arr){
            System.out.println(x);
        }

    }
}
