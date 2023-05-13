package PraticeProgram.StringPrograms;


public class EveryWordCapLastCarSmall {
    public static void main(String[] args) {
        String str = "great things comes with great responsibility";

        String capWord = "";
        str = str.toUpperCase();
        String []word = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            String w = word[i];
            String last = w.substring(word[i].length()-1);
            String restLetter = w.substring(0, word[i].length()-1);
//            System.out.println(restLetter);
//            System.out.println(last);
            capWord +=restLetter + last.toLowerCase()+ " ";

        }
        System.out.println(capWord); //GREAt THINGs COMEs WITh GREAt RESPONSIBILITy
    }
}
