package PraticeProgram;

public class MinNumberCoins {
    public static void main(String[] args) {
        // suppose you have coins of 1,2,and 5 and total 15 each have 5 coins you have.
        // calcualte the minimum number of coins required to equal user enterend number

         // ex = input = 33, o/p = 9
        int num = 33;

       int res = minNum(num);
        System.out.println(res);


    }
    static int minNum(int num){


        if(num > 40){
            return 0;
        }
        int count= 0;
        int rem =0;

        if(num > 25 ){
            count = count+5;

        }
        else {
            rem = num % 5;
        }
        if(rem > 10 ){
            count = count+ 5;
        }
        else {
            rem=count+ num % 2;
        }
        if(rem > 5 ){
            count = count+ 5;
        }
        else {
            rem=count+ num % 1;
        }

        return count;
    }

}
