package StringsPrograms;

public class PalindromString {

    public static void main(String[] args) {
        String str = "cat";
        boolean res = isPalindrom(str);
        if(res)
            System.out.println(str + " is palindrom");
        else
            System.out.println(str + " is not a palindrom");
    }

    static boolean isPalindrom(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                return false;
            }

        }
        return true;
    }
}
