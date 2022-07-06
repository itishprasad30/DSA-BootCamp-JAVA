package com.itish;

import java.util.Arrays;

public class MaxItemFromArray {
    public static void main(String[] args) {
        int[] arr = {2,6,88,34,25};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(maxRange(arr,0,1));

    }
    static int maxRange(int[] arr,int start,int end){

        int maxVal = arr[start];
        // woring on edge cases
//        if(end > start){
//            return -1;
//        }
//        if(arr == null){
//            return -1;
//        }

        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr){
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
    return maxVal;
    }
}
