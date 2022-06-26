package com.pintu;

import java.util.Scanner;

public class CharCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // trim will remove all the extra spaces

        if(ch >= 'a' && ch <='z'){
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }
    }
}
