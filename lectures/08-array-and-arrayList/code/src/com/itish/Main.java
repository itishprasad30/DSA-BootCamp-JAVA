package com.itish;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array - > it is a collection of primitive datatypes
        //           objects,complex datatypes you can store it in.

        // syntax -
        //  datatype[] variableName = new datatype[ size ];

        // note - variableName -> ref variable of an array pointing to Array object in RHS

                    // new = used to create an object

                    // declaration phase happens at compile time
                    // initialization phase happens at runtime ,i:e
                                // Dynamic memory allocation
                    // creating the object in heap memory

        // int [] nums ; // declaration of array , nums is getting defined
                        // in the "stack";
        // nums = new int[4]; // actually here object is being created in the
                             // memeory



        // ex -
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // or directly
        int[] nums = {1,2,3,4};

        //System.out.println(nums[5]); // array index out of bounds

        // take input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

        }
        
        // forEach enhanced forEach
        for (int number :
                numbers) {
            System.out.println(number + " ");
        }

        // array in objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));



    }
}
