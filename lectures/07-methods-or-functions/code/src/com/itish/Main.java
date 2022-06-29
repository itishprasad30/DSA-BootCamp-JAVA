package com.itish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int ans =  sum2();
        System.out.println("sum is : "+ ans);
       // take input of two number and print sum
//        Scanner in = new Scanner(System.in);
//        int a,b,sum;
//
//        System.out.print("Enter the number 1 : ");
//         a = in.nextInt();
//        System.out.println("Enter the number 2 : ");
//         b = in.nextInt();
//
//         sum = a + b;
//        System.out.println("The SUm is = "+sum);

        // if someone asks 100 times then you can not copy do not repeat yourself;
    }

    // return the value from sum
    static int sum2 () {
        Scanner in = new Scanner(System.in);
        int a,b,sum;
        System.out.print("Enter the number 1 : ");
        a = in.nextInt();
        System.out.println("Enter the number 2 : ");
        b = in.nextInt();

        sum = a + b;
        return  sum;

        // after the return statement the program will never execute
        // System.out.println("never executes");

    }

    /*
    access modifier  (oops concept) return_type  name () {

    // body
    return statement;
    }


    */


    static void sum () {
        Scanner in = new Scanner(System.in);
        int a,b,sum;

        System.out.print("Enter the number 1 : ");
         a = in.nextInt();
        System.out.println("Enter the number 2 : ");
         b = in.nextInt();

         sum = a + b;
        System.out.println("The SUm is = "+sum);
    }


}
