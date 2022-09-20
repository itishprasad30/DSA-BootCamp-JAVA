package StringsPrograms;

public class ReveseTheSentence {
    public static void main(String[] args) {
        String s1 = "Rama is boy";
        String res = reverseTheSentenceWord(s1);
        System.out.println(res); // boy is Rama
    }

    private static String reverseTheSentenceWord(String s1) {
        char []ch = s1.toCharArray();
        s1 ="";
        for (int i = ch.length-1; i>=0; i--) {
            int l = i;
            while (i>=0 && ch[i]!= ' '){
                i--;
            }
            int f = i +1;
            while (f<= l){
                s1 = s1+ch[f];
                f++;
            }
            if(i>=0){
                s1 = s1+ch[i];
            }

        }
        return s1;
    }
}
