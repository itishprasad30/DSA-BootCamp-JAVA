package PraticeProgram.StringPrograms;

public class PercentageOfChar {
    public static void main(String[] args) {
        String str = "Itish prasad sahoo";
        double []count = countCharater(str);

        for (int i = 0; i < count.length; i++) {
            int n = str.length();
            if(count[i]!= 0){
                double per = (count[i]/n) * 100;
                System.out.println((char) i +" :Percentage : "+ per);

            }
        }
    }

    private static double[] countCharater(String str) {
        double[] count = new double[128];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        return count;
    }
}
