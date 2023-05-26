package leetcodeQuestions.TopInterviewLevelQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int []arr = {1,0,-1,0,-2,2};
        int target = 3 ;
        System.out.println(fourSum(arr,target));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        // sort the arrays
        Arrays.sort(nums);

        // go to the up to 3
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        //skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }

        }
        return list;
    }
}
