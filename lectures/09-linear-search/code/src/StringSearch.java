import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "The Weeknd";
        char target = 'a';
        boolean res =  linearSearch(name,target);
        System.out.println(res);

        System.out.println(Arrays.toString( name.toCharArray())); //[T, h, e,  , W, e, e, k, n, d]

    }

    static boolean linerSearch2 (String str,char target){
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }

        }
        return false;
    }
     static boolean linearSearch(String str, int target) {
        if(str.length() == 0){
            return false;
        }

         for (int i = 0; i < str.length(); i++) {
             if(target == str.charAt(i)){
                 return  true;
             }
         }
        return false;
     }
}
