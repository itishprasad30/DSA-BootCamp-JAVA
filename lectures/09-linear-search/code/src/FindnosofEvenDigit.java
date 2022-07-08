// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).
public class FindnosofEvenDigit {

//    Input: nums = [12,345,2,6,7896]
//    Output: 2
//    Explanation:
//            12 contains 2 digits (even number of digits).
//            345 contains 3 digits (odd number of digits).
//            2 contains 1 digit (odd number of digits).
//            6 contains 1 digit (odd number of digits).
//            7896 contains 4 digits (even number of digits).
//    Therefore only 12 and 7896 contain an even number of digits.



    public static void main(String[] args) {
        int [] nums ={23,555,7421,5,33};
        int result = findNums(nums);
        System.out.println(result);// 3
        System.out.println(digit2(4852215)); // 7
    }
    static int findNums(int [] nums ){
        int count =0;

        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;

    }

    private static boolean even(int num) {
        int nosOfDigits = digit2(num);
        return nosOfDigits % 2 == 0;

    }
    // optimise way to find noof Digit in you number
    private static int digit2(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        return (int) (Math.log10(num)) +1 ;

    }
    private static int digit(int num) {
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num/= 10;

        }
        return count;
    }
}
