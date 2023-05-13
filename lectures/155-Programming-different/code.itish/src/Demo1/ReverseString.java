package Demo1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "java";
        char ch[] = str.toCharArray();
        int first = 0;
        int last = str.length()-1;
        while (first<last){
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }
        String strnew = new String(ch);
        System.out.println(strnew);

    }

}
