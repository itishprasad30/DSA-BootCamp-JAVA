public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {23,5,33,67,86};
        int target = 67;
        int result = linearSearchRange(arr,target,1,3);
        System.out.println(result);
    }

    static int linearSearchRange(int [] arr,int target,int start,int end){
        // edge case if array is empty
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // if element not found in the array
        return -1;
    }
}
