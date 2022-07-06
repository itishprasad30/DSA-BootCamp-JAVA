package com.itish;

public class GreatestNumber3nos {

    public static void main(String[] args) {
        int a =8,b=13,c=14,d;

        d = c > (a > b ? a:b) ? c: (a > b ? a:b);
        System.out.println("The Greatest Number is : " + d);
    }
}
