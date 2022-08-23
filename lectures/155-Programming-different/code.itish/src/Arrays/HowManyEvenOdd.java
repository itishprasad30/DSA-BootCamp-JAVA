package Arrays;

import java.util.Arrays;

public class HowManyEvenOdd {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7};
        int []pc = countEvenOdd(a);
        System.out.println("Number of even number "+ pc[0]);
        System.out.println("Number of odd number "+ pc[1]);

    }
    static int[] countEvenOdd2(int [] arr){
        int []count ={0,0};

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]%2] ++;
        }
        return count;

    }
    static int[] countEvenOdd(int [] arr){
        int e=0,o=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0)
                e++;
            else
                o++;
        }
        int[] count = {e,o};

        return count;


    }
}
