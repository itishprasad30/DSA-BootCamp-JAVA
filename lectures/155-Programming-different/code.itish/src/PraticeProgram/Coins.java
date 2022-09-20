package PraticeProgram;

import java.util.Arrays;

public class Coins {
    public static void main(String[] args) {
        int num = 33;
        int []arr ={1,2,5};
        int output = coinChange(arr,num);
        System.out.println(output);


    }
    public  static  int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin:coins) {
                if (i - coin < 0) continue;
                if (dp[i - coin] == Integer.MAX_VALUE) continue;
                dp[i] = Math.min(dp[i-coin] + 1, dp[i]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE?-1:dp[amount];
    }
    static int  countCoin(int n){
        int count = 0;
        for (int i = 0; i < n/5; i++) {
            for (int j = 0; j < n/2; j++) {
                for (int k = 0; k < n; k++) {
                    int a = i*5 + j*2 + k;
                    if(a == n)
                        count = i+j+k;
                    else if(a> n || i > 5 || j > 5 ||k>5)
                        break;
                    else {
                    }
                }

            }

        }
        return count;
    }

}
