package PraticeProgram.StringPrograms;

public class EnenNoIncrementOddDecrement {
    public static void main(String[] args) {
        String s1= "ABCDZA";
        String str = incre(s1);
        System.out.println(str); // BADCF
    }

    private static String incre(String s1) {
            char[] chr = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {


            if(i % 2== 0) {
                if(chr[i] == 'Z'){
                 chr[i] = 'A';
                }
                else {
                    chr[i]++;
                }
            }
            else {
                if(chr[i]== 'A'){
                    chr[i]= 'Z';
                }
                else {
                    chr[i]--;
                }
            }

        }
        return new String(chr);
    }

}
