package StringsPrograms;

public class SwapWordFirstCharToLastChar {
    public static void main(String[] args) {
        String str = "Rama is a boy";
        System.out.println(swap(str)); // aamR si a yob

    }
    static  String swap(String str){
        char[] ch = str.toCharArray();
        int f =0;
        for (int i = 0; i < ch.length; i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1] ==' '){
                // tracking the first index of the letter word
                f =i;
            } else if (i == ch.length-1 && ch[i] != ' ' || ch[i] != ' ' && ch[i+1] == ' ') {
                char t = ch[i];
                ch[i] = ch[f];
                ch[f] = t;

            }
        }
        return new String(ch);
    }
}
