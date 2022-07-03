package com.itish;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your Name : ");
        String naam = in.next();

        String personalised = helloName(naam);
        System.out.println(personalised);
        hello();


    }

     static String helloName(String name) {
        String yourName = "Hello " + name;
        return  yourName;
    }
    static void hello(){
        System.out.println("Some data");
    }

}
