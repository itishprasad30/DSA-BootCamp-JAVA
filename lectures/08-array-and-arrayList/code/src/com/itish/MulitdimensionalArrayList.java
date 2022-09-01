package com.itish;

import java.util.ArrayList;
import java.util.Scanner;

public class MulitdimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // for need to intialised
        for (int i = 0; i < 2; i++) {
            list.add(new ArrayList<>());
        }
        // adding elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    }
}
