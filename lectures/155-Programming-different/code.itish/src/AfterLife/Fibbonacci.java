package AfterLife;

public class Fibbonacci {
    public static void main(String[] args) {
        //fibbo = 1,1,2,3,5,8,13
        // fibbb= 1,2,3,4,5,6,7
        int result = fibbo(7);

        System.out.println(result);
        System.out.println(fiiboDp(7));
    }
    // using DP buttom up apporach
    public static int fiiboDp(int n){
        if(n==0)
            return 0;
        int []dp = new int[n+1];
        dp[0] =1;
        dp[1] = 1;
        for(int i=2 ; i<=n;i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }



    // using recursion
    public static int fibbo(int n){
        if(n==0)
            return 0;
        int result;
        if(n == 1|| n == 2){
             result =1;
        }else{
             result = fibbo(n-1)+ fibbo(n-2);
        }
        return result;
    }
}
