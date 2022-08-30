package StringsPrograms;

public class ConvertEveryWordsFirstLetterSmall {
    public static void main(String[] args) {
        String str = "Great things comes with Great Responsibility";

        str = lastLetterCap(str);
        System.out.println(str);

        int dc = wordCount(str);
        System.out.println(dc);
    }


    // convert all the word first Letter Capital
    static String firstLetterCap(String str){
        char []ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if( i==0 && ch[i]!=' '|| ch[i]!=' '&& ch[i-1] ==' ' ){
                if(ch[i]>= 'a'&& ch[i]<='z'){
                    ch[i]=(char) (ch[i]-32);

                }
            } else if (ch[i] >='A'&& ch[i]<='Z') {
                ch[i] = (char) (ch[i] +32);
            }
        }
        return new String(ch);

    }

    static String lastLetterCap(String str){
        char []ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if( i== ch.length-1 && ch[i]!=' '|| ch[i]!=' '&& ch[i+1] ==' ' ){
                if(ch[i]>= 'a'&& ch[i]<='z'){
                    ch[i]=(char) (ch[i]-32);

                }
            }else if(ch[i] >='A'&& ch[i] <= 'Z'){
                ch[i] = (char) (ch[i] +32);
            }
        }
        return new String(ch);

    }
    static int wordCount(String str){
        char []ch = str.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
            if( i==0 && ch[i]!=' '|| ch[i]!=' '&& ch[i-1] ==' ' ){
                count++;
            }

        }
        return count;
    }
}
