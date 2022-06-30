package com.itish;


public class Swap {
    public static void main(String[] args) {
        // swap the number
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println("The value of a :" + a);
        System.out.println("The value of b :" + b);

        String name = "Itish Prasad ";
        changeName (name);
        System.out.println(name); // itish prasad
        // swap a and b that a = 20, and b = 10

//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("The value of a :" + a); // 20
//        System.out.println("The value of b :" + b); // 10
    }

     static void changeName(String naam) {
        naam = "Pintu sahoo"; // create a new object

    }

    static void swap (int a,int b) {
        int temp = a;
        a = b;
        b= temp;
    }

}
