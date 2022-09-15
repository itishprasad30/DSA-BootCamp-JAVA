package DataStructures.ArraySortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {5,4,8,9,1,2,6};

        // time complexity is  T (O) = n^2
        // bubble sorting
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                // swap logic
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
