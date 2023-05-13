package leetcodeQuestions.Array;

import java.util.Arrays;

/*
66. Plus One
Easy

5502

4508

Add to List

Share
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
public class PlusOne {

    public static void main(String[] args) {
        int []arr = {2,3,4,9};
        int []res = plusArray(arr);
        System.out.println(Arrays.toString(res)); // [2,3,5,0]
    }
    static int[] plusArray(int []arr){
        int carry = 1;
        int n = arr.length;

        for(int i =n-1;i>=0;i--){
            arr[i] +=carry;
            carry = arr[i]/10;
            arr[i]= arr[i]%10;
        }

        if(carry ==1){
            // create a new Array
            int []newArr = new int[n+1];
            newArr[0] = 1;
            for(int i =1;i<=n;i++){
                newArr[i] = arr[i-1];
            }
            return newArr;
        }
        return arr;
    }
}
