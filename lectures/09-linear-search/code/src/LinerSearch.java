public class LinerSearch {
    public static void main(String[] args) {
        int[] nums ={23,56,8,893,25,86,42};
        int target = 25;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

     static int linearSearch(int[] arr,int target) {
        // edge case checks
         if(arr.length == 0){
             return  -1;
         }
         // run a for loop to go through every element in the array
         for (int index = 0; index < arr.length; index++) {
                   int element = arr[index];
                   if(element == target){
                       return index;
                   }
         }
         return -1;
    }
    static boolean linearSearch3(int[] arr,int target) {
        // edge case checks
        if(arr.length == 0){
            return  false;
        }
        // run a for loop to go through every element in the array
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // search and return the element
    static int linearSearch2(int[] arr,int target) {
        // edge case checks
        if(arr.length == 0){
            return  -1;
        }
        // run a for loop to go through every element in the array
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // if the element not found
        return -1;
    }
}
