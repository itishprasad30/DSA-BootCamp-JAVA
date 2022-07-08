
//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
            int[][] data = {
                    {1,2,3},
                    {3,4,5},
                    {5,14,1}
            };

            int result = maximumWealth(data);
        System.out.println(result);
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            // now check with sum overall
            // check with overall performance
            if (sum > ans) {
                ans = sum;
            }

        }
        return  ans;

    }


}
