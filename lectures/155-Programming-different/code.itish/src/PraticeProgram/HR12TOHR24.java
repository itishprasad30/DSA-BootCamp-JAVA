package PraticeProgram;

public class HR12TOHR24 {
    public static void main(String[] args) {
        String str = "07:12:23PM";
        print24(str);
    }

    public static void print24(String str) {
        // get the hours
        int h1 = (int) str.charAt(0)-'0';
        int h2 = (int) str.charAt(1)-'0';
        int hh = (h1*10 + h2 %10);

        // if time is AM
        if(str.charAt(8) =='A'){
            if(hh== 12){
                System.out.println("00");
                for (int i = 2; i <= 7 ; i++) {
                    System.out.print(str.charAt(i));
                }
            }else {
                for (int i = 0; i <= 7 ; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
        else {
            if(hh==12){
                System.out.print("12");
                for (int i = 2; i <=7; i++) {
                    System.out.print(str.charAt(i));

                }
            }else {
                hh= hh+12;
                System.out.print(hh);
                for (int i = 2; i <=7 ; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }

}
