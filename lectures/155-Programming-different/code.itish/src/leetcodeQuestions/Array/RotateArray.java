package leetcodeQuestions.Array;

import java.util.Arrays;

public class RotateArray {

    // time completiy = O(N) , space complexity = O(1)

    public static void rotate(int[] arr, int d, int n)
    {
        int p=1;
        while (p<=d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n-1]= last;
            p++;
        }

    }
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6};
        int size = arr.length;
        int n =2;

//        rotateArr(arr,n,size);
        rotate(arr,n,size);
        System.out.println(Arrays.toString(arr));

    }
    // in this time complexity = O(n),space complexity = O(n)

    static void rotateArr(int []arr,int d,int n){
        // create a new array
        int []res = new int[n];

        int k=0;

        for (int i = d; i < n ; i++) {
            res[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            res[k] = arr[i];
            k++;
        }
        for (int i=0;i<n;i++){
            arr[i]=res[i];
        }
    }
}





/*
        int []arr= {1,2,3,4,5};
        int n=2;
        for(int i=n,j=0;j<5;j++,i=(i+1)%5 ){
            System.out.print(arr[i] +",");
        }
 */
