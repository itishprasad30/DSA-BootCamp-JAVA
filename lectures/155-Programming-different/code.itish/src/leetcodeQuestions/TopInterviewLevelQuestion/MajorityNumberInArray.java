package leetcodeQuestions.TopInterviewLevelQuestion;

import java.util.Arrays;

public class MajorityNumberInArray {
    public static void main(String[] args) {
        int[] nums = {3,1,3,1,1};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int []nums){
        int elemenet = 0,count =0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                count = 1;
                elemenet = nums[i];
            } else if (elemenet == nums[i]) {
                count++;
            }else {
                count--;
            }
        }
        return elemenet;
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
