package StringsPrograms;

public class OddNumberCharIncrement {
    public static void main(String[] args) {
        String s1 = "hello";
        String inc = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch =s1.charAt(i);
            if(i % 2 ==0)
                if(ch == 'z')
                    ch ='a';
                else
                    ch++;
            else
                if(ch =='a')
                    ch = 'z';
                else ch --;
            inc += ch;
        }
        System.out.println(inc);

    }
}
