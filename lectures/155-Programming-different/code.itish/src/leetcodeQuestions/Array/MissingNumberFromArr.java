package leetcodeQuestions.Array;

public class MissingNumberFromArr {
    public static void main(String[] args) {
        int []arr= {0,1,3};
        int mis= missingNum(arr);
        System.out.println(mis); // 2
    }
    static int missingNum(int []arr){
        int sum = (arr.length) * (arr.length+1);
        sum = sum/2;

        for(int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
