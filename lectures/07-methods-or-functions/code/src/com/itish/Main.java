package com.itish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       int ans =  sum2();
//        System.out.println("sum is : "+ ans);

        int result = sum3(100,900);
        System.out.println(result);
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

    // arguments in the method calling is called as parameter
    static  int sum3(int a,int b){

        int ans = a +b;
        return  ans;
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
