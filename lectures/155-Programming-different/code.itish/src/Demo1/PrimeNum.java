package Demo1;

import java.util.Scanner;

//public class PrimeNum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        boolean res = isPrime(num);
//        if(res)
//            System.out.println("it is prime");
//        else
//            System.out.println("not prime");
//    }
//    public static boolean isPrime(int num){
//        int count = 0;
//        for (int i=2;i<=num/2 ;i++){
//            if (num % i == 0) {
//                count = 1;
//                break;
//            }
//        }
//        return count == 0;
//    }
//}

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 7;
        boolean isPrime = true;
        if(num <2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num% i ==0){
                    isPrime =false;
                    break;
                }
            }   
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}