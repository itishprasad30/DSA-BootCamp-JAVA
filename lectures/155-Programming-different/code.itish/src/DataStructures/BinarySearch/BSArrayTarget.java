package DataStructures.BinarySearch;

public class BSArrayTarget {
    public static void main(String[] args) {
        int []arr ={1,23,34,46,55,64,73};
        int target =64;
        int res = binarySearchRs(arr,target);
        System.out.println("Index found at "+ res);
    }
    static int binarySearchRs(int []arr,int target){
        return binarySearchRs(arr,target,0,arr.length-1);
    }
    static int binarySearchRs(int []arr,int target,int start,int end){
        if(start> end){
            return -1;
        }
        int mid = end-start/2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRs(arr,target,mid+1,end);
        }
        else {
            return binarySearchRs(arr,target,start,mid-1);
        }

    }

}
