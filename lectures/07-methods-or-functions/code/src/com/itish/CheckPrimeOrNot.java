package com.itish;

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPlaindrom(n));

        boolean result = isPrime(n);
        System.out.println(result);

        for (int i = 0; i < 30; i++) {
            if(isPrime(i)){
                System.out.print(i +" \t ");
            }

        }
//        System.out.println();
//        for (int i = 0; i < 1000; i++) {
//            if(isAmstorng(i)){
//                System.out.print(i + "\t");
//            }
//        }

    }

    static boolean isPlaindrom (int n){
        if(n<0 || n % 10 == 0){
            return false;
        }
        int orginal = n;
        int rev = 0;
        while (n> 0){
            int rem = n %10;
            n = n/10;
            rev = rev *10 + rem;
        }

        return rev == orginal;


    }
    static boolean isAmstorng (int n) {
        int orginal = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == orginal) return true;
        else return false;

    }

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                return false;

            }
            c++;
        }
        return c * c > n;

    }

}
