package Patterns;

import java.util.Scanner;
//Enter the lines Number:
//        5
//        a
//        b a
//        c b a
//        d c b a
//        e d c b a

public class ptr20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines Number: ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
