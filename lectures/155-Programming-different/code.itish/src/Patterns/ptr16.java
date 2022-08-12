package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5

//        1 1 1 1 1
//        0 0 0 0
//        1 1 1
//        0 0
//        1
public class ptr16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for (int i = n;i>=1  ; i--) {
            for (int j = i; j>=1 ; j--) {
                System.out.print(i%2 + " ");
            }
            System.out.println();

        }
    }
}
