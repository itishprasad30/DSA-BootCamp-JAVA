package PraticeProgram.StringPrograms;

public class FirstRepeadtedAndNonRepeatedChar {
    public static void main(String[] args) {
        String str = "adfffgg";
        repeated(str);

    }

    static void repeated (String str){
        int []count = new int[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < count.length; i++) {

            if(count[i]>1){
                System.out.println("First repeated char is : "+(char) i );
                break;
            }
            if(count[i]==1){
                System.out.println("First non repeated char is "+ (char)i);

            }

        }
    }
}
