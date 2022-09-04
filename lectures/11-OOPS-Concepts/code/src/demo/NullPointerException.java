package demo;

public class NullPointerException {
    public static void main(String[] args) {

        String s= "12";
        int ii = Integer.parseInt(s);
        System.out.println(ii);

        String ss = "123";

        int d =0;
        for (int i = 0; i < ss.length(); i++) {
            d = d* 10 + ss.charAt(i) - '0';

        }
        System.out.println(d);

        System.out.println("main start");
        String sss= null;
        try{
            System.out.println(sss.length());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("main end");
    }
}
