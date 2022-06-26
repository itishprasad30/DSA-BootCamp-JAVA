package com.pintu;

import java.util.Scanner;

public class Conditons {

    public static void main(String[] args) {
        /*

        sytax of if statements
        if(boolean expression T or ) {
           // body
           } else {
           // do this
           }
         */


        // input the salary from the keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Please Input the Salary from the Keyboard : " );
        int salary = input.nextInt();

        // if salalry is inputed : 25400

        if(salary > 1000) {
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }

        System.out.println(salary); // 27_400


        if (salary > 14_000) {
            salary+= 20; // 27_420

        } else if (salary > 20_000) {

            salary+=50;
        } else  {
            salary += 1;
        }

        System.out.println("The updated Salary is  : " + salary); // 27420
    }
}
