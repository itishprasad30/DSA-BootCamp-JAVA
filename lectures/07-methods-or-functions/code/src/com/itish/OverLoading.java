package com.itish;

import java.util.Arrays;

import static com.itish.Shadowing.fun;

public class OverLoading {
    public static void main(String[] args) {
        fun(23);
        fun( 23,44);

        random("Itish");
        random(34);

        demo(12,22,34);
        demo("Pintu","Imagine Dragron");
        // demo(); // error Ambiguous method call. Both

    }

     static void demo(int ...x) {
         System.out.println(Arrays.toString(x));
    }
 static void demo(String ...x) {
     System.out.println(Arrays.toString(x));
    }

    static void random(String name) {
         System.out.println(name);
    }
    static void random(int a) {
         System.out.println(a);
    }

    static void fun(int x){
        System.out.println(x);
    }
    static void fun(int a,int b){
        System.out.println(a+b);
    }
}
