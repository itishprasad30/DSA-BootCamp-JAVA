package DataStructures.Recursion;

public class SearchTargetElementFromArray {
    public static void main(String[] args) {
        int []arr = {4,322,5,7,88,44,33,88};
        int index = search(arr,88,0);
        System.out.println("Element is presenet at :" + index);
    }
    static int search(int[] arr,int target,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return search(arr,target,i-1);
    }


}
