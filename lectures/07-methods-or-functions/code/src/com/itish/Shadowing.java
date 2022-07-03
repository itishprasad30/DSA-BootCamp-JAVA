package com.itish;

public class Shadowing {
    // static - > means object independent you can't use object dependant things in object independant things.
    static  int x = 15; //  x will be shadowed at line no 11;

    public static void main(String[] args) {
        System.out.println(x); // 15


        // local variable
//        int x = 59;
//        System.out.println(x);// 59

        // senario
//        int x ; // decalration phase
//        System.out.println(x); // error variable x might not being initialized;
        // reason scope will begin when value in intialised.
//
//        x = 59; // inialisation phase



        fun();// 15
    }

    static void fun(){
        System.out.println(x);
    }
}
