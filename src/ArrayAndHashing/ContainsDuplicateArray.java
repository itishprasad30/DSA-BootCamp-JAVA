package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */
public class ContainsDuplicateArray {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,4,4};
        boolean res = containsDuplicate2(arr);
        if(res)
            System.out.println("Duplicate Element present");
        else
            System.out.println("No Duplicate Element Present");
    }
    // normal way Time Complexity = nlogn
    public static boolean containsDuplicate(int []arr){
        //Array SOrt
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]== arr[i+1]){
                return true;
            }
        }
        return false;
    }
    // using Set or Map
    public static boolean containsDuplicate1(int []arr){
        Set<Integer> set = new HashSet<> ();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static boolean containsDuplicate2(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i],1);
        }
        return false;
    }
}
