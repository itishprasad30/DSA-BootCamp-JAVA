package leetcodeQuestions.Array;
/*
268. Missing Number
Easy


Share
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumberFromArr {
    public static void main(String[] args) {
        int []arr= {0,1,3};
        int mis= missingNum(arr);
        System.out.println(mis); // 2
    }
    static int missingNum(int []arr){
        int sum = (arr.length) * (arr.length+1);
        sum = sum/2;

        for(int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
