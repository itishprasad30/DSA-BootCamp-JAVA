package leetcodeQuestions.Array;

public class Even1stOddLast {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7};
        evenOdd(arr);
    }
    static void evenOdd(int[] arr){
        int [] res = new int[arr.length];
        int index =0;
        for (int j : arr) {
            if (j % 2 == 0) {
                res[index] = j;
                index++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!= 0){
                res[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ,");
        }





    }
}
