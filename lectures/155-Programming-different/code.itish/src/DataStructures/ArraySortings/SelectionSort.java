package DataStructures.ArraySortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {5,4,8,9,1,2,6};

        // time complexity is  T (O) = n^2
        // Selection sorting
        for (int i = 0; i < arr.length -1; i++) {
            int smallest = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
