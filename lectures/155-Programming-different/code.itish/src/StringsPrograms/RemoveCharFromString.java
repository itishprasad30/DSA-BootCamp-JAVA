package StringsPrograms;


/*
wap to remove a character from the String

 */
public class RemoveCharFromString {

        public static void main(String[] args) {
            String str = "java";
            char ch = 'v';
            String res = remove(str,ch);
            System.out.println(res); // jaa
        }
        static String remove(String str,char ch){
            char [] chr = str.toCharArray();
            int ele =-1;
            for (int i = 0; i < chr.length; i++) {
                if(chr[i] == ch){
                    ele = i;
                    break;
                }
            }
            char [] ch1 = new char[chr.length-1];
            for (int i = 0; i < ch1.length; i++) {
                if(i<ele){
                    ch1[i] = chr[i];
                }
                else {
                    ch1[i] = chr[i+1];
                }
            }
            return new String(ch1);
        }


}
