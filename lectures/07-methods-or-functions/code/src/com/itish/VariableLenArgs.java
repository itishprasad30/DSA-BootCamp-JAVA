package com.itish;

import java.util.Arrays;

public class VariableLenArgs {
    public static void main(String[] args) {
//        func(1,2,3,4,5);
        multiple(2,4,"Taylor","Harry","The Weeknd");



    }


    // ... means any number from 0 to any number of arguments
    // that should be last in the argument
    static void func(int ...x) {
        System.out.println("Itish Prasad Sahoo");
        System.out.println(Arrays.toString(x));
    }
    static void  multiple(int a,int b,String ...data ) {
        System.out.println(a*b);
        System.out.println(Arrays.toString(data));

    }


}
