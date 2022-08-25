package Arrays;

import java.util.Arrays;

public class InsertAElementInArray {
    public static void main(String[] args) {
        int []arr = {22,33,42,55,67};
        arr = insertArr(arr,39,2);
        for (int j : arr) {
            System.out.println(j + " ");
        }

        int []deleteArr = deleteArray(arr,2);
        System.out.println(Arrays.toString(deleteArr)) ;


    }
    static int[] deleteArray (int[] arr ,int in){
        if(in< 0 || in>= arr.length){
            System.out.println("Index not in range ");
            return arr;
        }
        int []rs = new int[arr.length -1];

        for (int i = 0; i < rs.length; i++) {
            if(i<in)
                rs[i] = arr[i];
            else
                rs[i] =  arr[i+1];


        }
        return rs;
    }
    static int[] insertArr(int []x,int dc,int in){
        if(in < 0 || in > x.length){
            System.out.println("Index new element out of range");
            return x;
        }
        int [] y = new int[x.length+1];
        y[in] = dc;

        for (int i = 0; i < x.length; i++) {
            if(i<in)
                y[i] = x[i];
            else
                y[i+1] = x[i];
        }
        return y;
    }
}
