package com.itish;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {2,6,8,34,25};
        //System.out.println(arr); // it will print random address
        System.out.println(Arrays.toString(arr));

//        swap (arr,0,4);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr)); //[25, 34, 8, 6, 2]
    }


    static void reverse(int[] arr) {
      int start = 0;
      int end = arr.length -1;

      while (start< end){
          swap( arr,start,end);
          start++;
          end--;
      }

    }
     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
