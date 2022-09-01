package StringsPrograms;

public class SumOfDigitInString {
    public static void main(String[] args) {
        String s1 = "asd33fi";
        char[] ch = s1.toCharArray();
        int sum=0;
        for (int i = 0; i < ch.length; i++) {

            if(ch[i]>= '0' && ch[i]<= '9'){
                int a= Integer.parseInt(String.valueOf(ch[i]));
                sum = sum+a;
            }
        }
        System.out.println("Sum of Digits in String : " + sum);
    }
}
