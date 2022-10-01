package leetcodeQuestions.StringBased;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String st= "amazon";
        char ch = 'a';
        System.out.println(remove(st,ch));
    }
    static String remove(String str,char ch){
        StringBuilder sb = new StringBuilder();
        char [] chstr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(chstr[i]==ch){

            }
            else {
                sb.append(chstr[i]);
            }
        }
        return sb.toString();

    }
}
