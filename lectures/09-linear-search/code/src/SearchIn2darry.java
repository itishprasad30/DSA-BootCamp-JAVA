import java.util.Arrays;

public class SearchIn2darry {
    public static void main(String[] args) {
        int[][] arr= {
                {21,45,76},
                {44,65,22},
                {54,32,89},
                {877,34}
        };

        int target = 32;
        int[] ans = search(arr,target); // {row,col}
        System.out.println(Arrays.toString(ans));
//        System.out.println(search(arr,target));
        System.out.println(max(arr));
    }

     static int[] search(int[][] arr, int target) {
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col]== target){
                     return new int[]{row,col};
                 }

             }
         }
        return  new int[]{-1,-1};
    }
    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {

                if (element > max) {
                    max = element;
                }

            }
        }
        return  max;
    }
}
