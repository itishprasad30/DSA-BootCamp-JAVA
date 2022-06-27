package com.pintu;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 123456;

        int ans = 0;

        while (num > 0 ) {
            int rem = num % 10;  // it gives only last numer ex - 123456 -> 6

            num = num / 10;     // it gives only rest digits except from rem -> 12345 update
            ans = ans * 10 + rem;   // now ans will be added 0 * 10 + rem = 6 , then 6* 10+5 = 65 goes on...
        }
        System.out.println(ans);
    }
}

