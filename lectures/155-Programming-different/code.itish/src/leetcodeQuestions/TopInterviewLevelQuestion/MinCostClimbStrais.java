package leetcodeQuestions.TopInterviewLevelQuestion;

/*
746. Min Cost Climbing Stairs
Easy

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

 */
public class MinCostClimbStrais {
    public static void main(String[] args) {
        int []arr = {10,15,20};
        int res = minCostClimbingStairs(arr);
        System.out.println(res);

    }
    // using dp and Iterative + no extra space
    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length ==0 || cost.length == 1) return 0;
        int cost2 = 0,cost1 = 0,minCost = 0;

        for(int i=2;i<= cost.length ; i++){
            minCost = Math.min(cost[i-2] + cost2 , cost [i-1]+ cost1);
            cost2 = cost1;
            cost1 = minCost;
        }
        return minCost;

    }

    // using dp + iterative + extra space
//     public static int minCostClimbingStairs(int[] cost){
//         if(cost.length ==0 || cost.length == 1) return 0;

//         int [] minCostArr = new int[cost.length +1];
//         int costMinus2,costMinus1;

//         for(int i=2;i< minCostArr.length ; i++){
//             costMinus2 = cost[i-2]+ minCostArr[i-2];
//             costMinus1 = cost[i-1]+ minCostArr[i-1];

//             minCostArr[i] = Math.min(costMinus2,costMinus1);

//         }
//         return minCostArr[minCostArr.length -1];
//     }
}
