package StringsPrograms;

public class ReverseTheWordsInSentence {
    public static void main(String[] args) {

        String s1 = "Rama is boy";
        String res = reverseTheWord(s1);
        System.out.println(res); // amaR si yob
    }

     static String reverseTheWord(String str) {
        char [] ch = str.toCharArray();
        str ="";
         for (int i = 0; i < ch.length; i++) {
             int f = i;
             while (i<ch.length && ch[i] != ' '){
                 i++;
             }
             int l = i -1;
             while (l >=f){
                 str = str+ch[l];
                 l--;
             }
             if(i<ch.length){
                 str = str+ch[i];
             }

         }
         return str;

    }

}
