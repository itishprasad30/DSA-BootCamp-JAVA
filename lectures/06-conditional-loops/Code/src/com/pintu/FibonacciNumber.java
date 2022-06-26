package com.pintu;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Please input the number to find Fibonacci Num : ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prev = 0;
        int curr = 1;
        int count = 2;

        while (count <=n){
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }

        System.out.println("fibonacci of this : "+curr);

    }
}
