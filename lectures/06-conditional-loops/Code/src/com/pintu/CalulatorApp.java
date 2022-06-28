package com.pintu;

import java.util.Scanner;

public class CalulatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take the input from user till user press 'X' or 'x'
        int ans = 0;
        // infinite while loop
        while(true){
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);


            if(op == '+' || op== '-' || op == '*' || op =='/' || op == '%'){
                // input two numbers
                System.out.println("Enter the Two Numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 -num2;
                }
                if(op == '*'){
                    ans = num1 * num2;

                }
                if(op == '/'){
                    ans = num1 /num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }



            }else if (op == 'X' || op == 'x') {
                break;
            }else {
                System.out.println("You have Entered the Wrong input .");
            }
                System.out.println(ans);
        }
    }
}
