package DataStructures.DivideAndConqure;

import java.util.Arrays;
// Time complexity is  O(nlogn)
public class MergeSort {
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    // for divideing the T(O) = logn
    static void divide(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conqure(arr,start,mid,end);
    }
    // for conqureing the T(O) = n times so total is [nlogn]
    static void conqure(int []arr,int start,int mid,int end){
        int []merged = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid +1;
        int x =0;
        while (idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){  // if you want ace or desc the change here
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }

        }
        while (idx1<= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2<=end){
            merged[x++] = arr[idx2++];
        }

        for (int i=0,j=start ; i<merged.length ; i++,j++){
            arr[j] = merged[i];
        }
    }
}
