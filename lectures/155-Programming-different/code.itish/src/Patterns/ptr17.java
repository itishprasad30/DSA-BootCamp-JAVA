package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5

//        1 0 1 0 1
//        1 0 1 0
//        1 0 1
//        1 0
//        1

public class ptr17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for (int i = 1;i<=5  ; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print(j%2 + " ");
            }
            System.out.println();

        }
    }
}
