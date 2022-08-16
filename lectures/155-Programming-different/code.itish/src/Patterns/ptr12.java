package Patterns;

import java.util.Scanner;

//Enter the lines Number:
//        5
//        1
//        0 1
//        0 1 0
//        1 0 1 0
//        1 0 1 0 1
public class ptr12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(k++ %2+" ");
            }
            System.out.println();
        }
    }
}
