package StringsPrograms;

public class FirstLetterCapRemainingSmall {
    public static void main(String[] args) {
        String str ="great things comes with great responsibility";
        String words[]=str.split(" ");
        String capitalizeWord="";
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst +" ";
        }
        System.out.println(capitalizeWord.trim());
    }
}
