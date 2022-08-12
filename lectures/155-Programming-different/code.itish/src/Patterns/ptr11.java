package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5
//        1 2 3 4 5
//        6 7 8 9 1
//        2 3 4 5 6
//        7 8 9 1 2
//        3 4 5 6 7
public class ptr11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();
        int limit=10;
        int k=1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(k+ " ");
                k++;
                if(limit==k) {
                    k=1;
                }
            }

            System.out.println();
        }
    }

}
