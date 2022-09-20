import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {5,4,6,7,1,2};
        // bubble sorting
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
         for (int i = 0; i < arr.length ; i++) {
             // find the max element in the array
             // swap with the currensponding
             int last = arr.length -i -1;
             int maxIndex  = getmaxIndex(arr,0,last);
             swaping(arr,maxIndex,last);
         }
    }

    private static void swaping(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getmaxIndex(int[] arr, int s, int e) {
        int max = s;
         for (int i = s; i <= e; i++) {
             if(arr[max] < arr[i]){
                 max = i;
             }
         }
        return max;
    }

    static void sortingNormalWay(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length ; j++) {
                 if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
    }
}
