package DataStructures.Recursion;

import java.util.Scanner;

public class FibonacciNumberOFNthNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci number : ");
        int n = in.nextInt();
        int fib = getFib(n);
        System.out.println(n + " th fibonacci number is : "+ fib );
    }

    static int getFib(int n) {
        if(n ==1)
            return 0;
        if(n==2)
            return 1;
        return getFib(n-1)+ getFib(n-2);
    }
}
