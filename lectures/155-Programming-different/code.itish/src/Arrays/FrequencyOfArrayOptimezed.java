package Arrays;

import java.util.Arrays;

public class FrequencyOfArrayOptimezed {
    public static void main(String[] args) {
        int [] arr = { 14,67,99,57,34,65,43,66};
        frequencyOfArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void frequencyOfArray(int [] arr){
        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> big)
                big= arr[i];
        }

        int []count = new int[big+1];
        for (int i = 0; i < arr.length; i++) {
           count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i]!= 0){
                System.out.println(i + " -------> "+count[i]);
            }
        }
    }
}
