package StringsPrograms;



//Panagram - > A sentence Containg every letter alphabet
public class PanagramOrNot {
    public static void main(String[] args) {
        String str = "Aabcdefghijklmnnopqrstuvwxyz";


        boolean res = isPanagram(str);
        if (res)
            System.out.println("Panagram");
        else
            System.out.println("not panagram");

    }
    static boolean isPanagram(String str){
        int []count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A'&& ch<='Z'){
                count[ch-65]++;
            }
            if(ch>='a'&& ch<='z'){
                count[ch-97]++;
            }

        }

        for (int i = 0; i < count.length; i++) {
            System.out.println((char)(i+65) +"---->" + count[i]);
            if(count[i]== 0)
                return false;
        }
        return true;
    }
}
