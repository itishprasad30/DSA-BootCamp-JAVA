package AfterLife;

import java.util.Arrays;
import java.util.HashMap;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 13;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
    }
    public static int[] twoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];

            for(int j=1;j<arr.length;j++){
                if(diff== arr[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum1(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
              return new int[] {map.get(diff),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
