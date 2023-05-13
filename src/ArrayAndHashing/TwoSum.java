package ArrayAndHashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

//         int max = nums.length;

//         for(int i= 0 ; i< max;i++){
//             int diff = target - nums[i];

//             for(int j= i+1; j< max;j++){
//                 if(nums[j] == diff){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{0,0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];

            if (map.containsKey(diff))
            {
                return new int[] {map.get(diff), i};
            }
            else
            {
                map.put(nums[i], i);
            }

        }
        return new int[]{-1,-1};

    }
}
