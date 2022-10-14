package leetcodeQuestions.Array;

public class MissingNumFromArr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,5};
        int miss = missingNum(arr);
        System.out.println(miss);
    }
    static int missingNum(int[] arr){
        int n = arr.length;
        int sum =( (n+ 1) * (n+2)) /2;
        for (int i = 0; i < n ; i++) {
            sum= sum-arr[i];

        }
        return sum;
    }
}
