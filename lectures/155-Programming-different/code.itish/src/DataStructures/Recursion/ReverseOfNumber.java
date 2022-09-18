package DataStructures.Recursion;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //546
        System.out.println(reverse(n)); // 645

    }
    static int reverse(int n){
        return reverse(n,0);
    }
    static int reverse(int n,int rev){
        if(n==0)
            return rev;
        return reverse(n/10,rev * 10 + n %10);

    }
}
