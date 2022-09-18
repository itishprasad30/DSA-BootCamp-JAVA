package DataStructures.Recursion;

import java.util.Scanner;

public class GreatestCommonDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first num");
        int m = in.nextInt();
        System.out.println("enter the second num");
        int n= in.nextInt();
        int gcd = gcd(m,n);
        System.out.println("GCD IS " + gcd);
    }
    static int gcd(int m,int n){
        if(m<n)
            return gcd(n,m);
        if(m%n == 0)
            return n;
        return gcd(n,m%n);
    }
}
