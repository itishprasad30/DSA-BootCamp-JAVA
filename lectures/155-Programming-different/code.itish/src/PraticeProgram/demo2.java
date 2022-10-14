package PraticeProgram;

import java.io.*;
import java.util.*;

class demo2 {
    public static void main(String args[])
    {
        int[] number = { 2, 3 };
        int n = number.length;


        letterCombinations(number, n);
    }

    static ArrayList<String>
    letterCombinationsUtil(int[] number, int n,
                           String[] table)
    {

        ArrayList<String> list = new ArrayList<>();

        Queue<String> q = new LinkedList<>();
        q.add("");

        while (!q.isEmpty()) {
            String s = q.remove();


            if (s.length() == n)
                list.add(s);
            else {
                String val = table[number[s.length()]];
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }


    static void letterCombinations(int[] number, int n)
    {

        String[] table
                = { "0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };

        ArrayList<String> list
                = letterCombinationsUtil(number, n, table);

      
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }



}