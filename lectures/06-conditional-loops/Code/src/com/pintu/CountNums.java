package com.pintu;

import java.util.Scanner;

public class CountNums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a multiDigitNumber :");
        int inputNum = in.nextInt();
        System.out.print("Enter the digit to find : ");
        int findNum = in.nextInt();

        int count = 0;
        while (inputNum > 0){
            int rem = inputNum % 10;  // only last digit will give us the digit

            if(rem == findNum){
                count++;
            }
            inputNum = inputNum/10; // it will remove the one digit from last
        }
        System.out.println(count);
    }
}
