package com.itish;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int [] arr = {3,4,77,89};
        System.out.println(Arrays.toString(arr));
        change(arr); // change the actual object itself both are pointing to same object
        // string are inmutable in java

        // array are mutable in java , mutable - change the object

        System.out.println(Arrays.toString(arr));

    }

    static void change(int [] nums) {
        nums[0] = 546;
    }
}
