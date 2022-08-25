package Arrays;

import java.util.Arrays;

public class InsertArrayInsideArray {
    static  int[] insetArr(int []arr,int []brr,int in){
        if(in<0 || in > arr.length){
            System.out.println("Index not in the range");
            return arr;
        }
        int []res = new int[arr.length+ brr.length];
        for (int i = 0; i < brr.length; i++) {
            res[in+i] = brr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<in)
                res[i] = arr[i];
            else
                res[i+brr.length] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] brr = {7,8,9,66};

        int []result = insetArr(arr,brr,2);
        System.out.println(Arrays.toString(result));
    }
}
