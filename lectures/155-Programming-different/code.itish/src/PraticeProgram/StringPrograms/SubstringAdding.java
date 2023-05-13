package PraticeProgram.StringPrograms;

public class SubstringAdding {
    public static void main(String[] args) {
        String str = "Itish Prasad Sahoo";
        String s1 = "Taylor Swift";
        String newStr = insertString(str,s1,3);
        System.out.println(newStr); // ItiTaylor Swiftsh Prasad Sahood

    }
    static String insertString (String str,String s1,int in){
        if(in < 0 || in> str.length())
            return null;
        char[] ch = str.toCharArray();
        char ch1[] = s1.toCharArray();
        char []concat =  new char[ch.length + ch1.length];
        for (int i = 0; i < ch1.length; i++) {
            concat[in+i] = ch1[i];
        }
        for (int i = 0; i < ch.length; i++) {
            if(i<in)
                concat[i] = ch[i];
            else
                concat[i+ch1.length] = ch[i];
        }
        return  new String(concat);
    }
}
