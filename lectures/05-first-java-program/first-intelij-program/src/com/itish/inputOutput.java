package com.itish;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your name : ");


        String name = input.nextLine();
        System.out.println("The name is  : " + name);


    }
}
