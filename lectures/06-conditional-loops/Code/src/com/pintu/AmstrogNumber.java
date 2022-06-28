package com.pintu;

import java.util.Scanner;

public class AmstrogNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Test Amsotrong Number :");

        int number = 13;
        int orginalNumber,reminder, result = 0;

        orginalNumber = number;

        while (orginalNumber != 0) {
           reminder = orginalNumber % 10;

           result += Math.pow(reminder,3);
           orginalNumber  = orginalNumber / 10;


        }
        if(result == number){
            System.out.println("It is a  Amstrong Number ;");
        }else {
            System.out.println("Not a Amstrong number ");
        }
    }
}
