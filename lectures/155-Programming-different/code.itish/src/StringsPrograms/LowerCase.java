package StringsPrograms;


public class LowerCase {
    public static void main(String[] args) {
        String s1 = "ITISH PRASAD";
        char []ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
                if(ch[i] >='A'&& ch[i]<='Z')
                    ch[i]=(char)((int)ch[i]+32);
        }
        System.out.println("Lower Case String is: ");
        for (char c : ch) {
            System.out.print(c);
        }

    }
}
