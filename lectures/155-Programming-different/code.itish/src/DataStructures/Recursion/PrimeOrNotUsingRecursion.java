package DataStructures.Recursion;

import java.util.Scanner;

public class PrimeOrNotUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPrime(n);
        if(res)
            System.out.println(n +" is Prime number ");
        else
            System.out.println(n + " is not a Prime Number");
    }
    static boolean isPrime(int n){
        return isPrime(2,n);
    }
    static boolean isPrime(int i,int n){
        if(i> n/2)
            return true;
        if(n%i ==0)
            return false;
        return isPrime(i+1,n);
    }
}
