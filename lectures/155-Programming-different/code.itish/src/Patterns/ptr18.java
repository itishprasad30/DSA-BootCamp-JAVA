package Patterns;

import java.util.Scanner;

public class ptr18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();
        int k= 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j>=1; j--) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }
    }
}
