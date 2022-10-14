package PraticeProgram;

public class CountDigits {
    public static void main(String[] args) {
        int i =123454;
        // 1st way
//        String str = Integer.toString(i);
//        System.out.println(str.length());
        // 2nd way
//        int count =0;
//        while (i!=0){
//            count++;
//            i = i/10;
//        }
//        System.out.println(count);

      // 3rd way
        int res = (int) Math.log10(i)+1;
        System.out.println(res);
    }
}
