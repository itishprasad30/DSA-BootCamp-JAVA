package Patterns;

import java.util.Scanner;

//Enter the lines Number:
//        5

//        A B C D E
//        A B C D
//        A B C
//        A B
//        A

public class ptr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
