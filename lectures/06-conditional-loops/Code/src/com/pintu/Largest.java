package com.pintu;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q : find the largest between 3 numbers;

        // 1st way

//        int max = a;
//        if(b > max ) {
//            max =b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        // 2nd way

//        int max = 0;
//        if(a > b) {
//            max = a;
//        }else {
//            max =b;
//        }
//        if( c > max) {
//            max = c;
//        }
//
//        System.out.println(max);
        // 3rd way

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

      System.out.println(Math.max(30,10)); // 30


    }
}
