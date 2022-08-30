package StringsPrograms;

public class HowManyMislaniousPresent {
    public static void main(String[] args) {
        String str = "@#$%@#$%iasdifo";

        int sp=0,vc=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch>='A'&& ch<='Z')
                vc++;
            else if (ch>='a'&& ch<='z')
                vc++;
            else if (ch>='0'&& ch<='9')
                vc++;
            else
                sp++;
        }

        System.out.println("Special Charecter present in the string is :"+sp);

    }

}
