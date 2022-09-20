import java.util.Arrays;

/*
Note In Insertion Sort the TIme COMPLextity Worst case will be  T(N)  = O(N^2)
 but in case of best case Best case Time complexity = O(N)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void insertion(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j >0 ; j--) {
                 if(arr[j] < arr[j-1]){
                     // swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                 }

             }

         }
    }
}
