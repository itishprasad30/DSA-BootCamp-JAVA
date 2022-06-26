package com.pintu;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops");
        // we have 3 types of loops in there ,

        // For Loop
        //Syntax for loop
        /*  for (initalization ; condition ; increment/ decrement ){
          // body bart
          }
        */

        // Ex -:

        // print 1 to 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2nd is while loop : Note use while loop where you did not know the how many times the loop will run

        /*
        while loop syntax :

        initialization part goes here:

        while (condition ) {
        // body

        increment or decrement
        }

         */

        //ex : print 1 - 5
        System.out.println("This is for the while loops ");
        int num = 1;
        while ( num <= 5) {
            System.out.println(num);
            num+= 1;
        }


        // 3rd one is do while loops  : the main difference is between do while and while loop is do while atleast exacute once in its program


        // syntax for it
        /*
        initialization

        do {

        } while (condition)
         */
        int n = 10;
        do {
            System.out.println("HEllo world"); // this will exhicute once in a life
        }while (n != 10);
    }

}
