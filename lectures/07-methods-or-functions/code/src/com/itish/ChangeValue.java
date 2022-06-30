package com.itish;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0] = 33;// if you make change to the reference variable same object will be changed.
    }

}
