package com.itish;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList is a class and collection framework that java people already created.
        // syntax
         ArrayList <Integer> list = new ArrayList<>(10);
        // here ArrayList is a Collection of framework
        // <> this is generics what type of data store in this.
        // Integer is a wrapper class from primitive datatype int
        // you can't use <int>
        // list is a reference variable pointing to the ArrayList
        // () inside this is a constructor - all initial value to define the object you can add here.


        // list object have add method() in it
        list.add(23);
        list.add(34);
        list.add(54);
        System.out.println(list);

        System.out.println(list.contains(2)); // false

        System.out.println(list.get(2)); // 54
        list.remove(1); // index no will deleted
        System.out.println(list);// [23,54]


        //input forloop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
