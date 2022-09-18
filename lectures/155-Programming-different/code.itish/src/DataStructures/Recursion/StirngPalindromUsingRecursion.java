package DataStructures.Recursion;

public class StirngPalindromUsingRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrom("madam"));
        System.out.println(isPalindrom("hello"));
    }
    static boolean isPalindrom(String str){
        return isPalindrom(str,0,str.length()-1);
    }
    static boolean isPalindrom(String str,int i,int j){
        if(i>=j)
            return true;
        if(str.charAt(i) != str.charAt(j))
            return false;
        return isPalindrom(str,i+1,j-1);
    }
}
