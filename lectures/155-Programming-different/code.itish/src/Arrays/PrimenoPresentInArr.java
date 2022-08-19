package Arrays;

import java.util.Scanner;

public class PrimenoPresentInArr {

    static int countPrimeNumber(int[] x){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            boolean res = isPrime(x[i]);
            if (res )
                count++;
        }
        return count;
    }

     static boolean isPrime(int n) {
         for (int i = 2; i <= n/2 ; i++) {
             if(n % i ==0)
                 return false;

         }
         return true;
    }

    static int[] readArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array");

        int size = in.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int []a = readArray();

        int pc = countPrimeNumber(a);
        System.out.println("Total Prime number present in array is :"+ pc);



    }
}
