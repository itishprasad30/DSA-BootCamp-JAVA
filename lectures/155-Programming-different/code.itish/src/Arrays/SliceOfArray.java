package Arrays;

import java.util.Arrays;

public class SliceOfArray {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7,8,9};
        int start = 2;
        int end =  5;
        int j = 0;
        int [] slice = new int[end - start + 1];
        for (int i = 0; i < arr.length; i++) {
            if(i>= start && i<= end){
                slice[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(slice));
    }
}
