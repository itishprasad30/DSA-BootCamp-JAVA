package Patterns;

import java.util.Scanner;


//Enter the lines Number:
//        5

//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1


public class ptr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
