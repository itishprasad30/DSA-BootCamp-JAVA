package com.itish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Two numbers to sum the number: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("Result : " + sum);

    }
}
