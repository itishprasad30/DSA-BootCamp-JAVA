import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int []arr = {5,4,6,7,1,2};
        // bubble sorting
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubbleSort(int[] arr) {
         boolean swapped ;
         for (int i = 0; i < arr.length; i++) {
             swapped = false;
             for (int j = 1; j <= arr.length-1 -i; j++) {
                 if(arr[j]< arr[j-1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1]= temp;
                     swapped = true;
                 }

             }
             // if you didnot swap a perticular value of i , it means array is sorted no need to swap stop the program
             if(!swapped){
                 break;
             }


         }
    }
}
