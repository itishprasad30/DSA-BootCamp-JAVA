package PraticeProgram.StringPrograms;


/*
54321
12345
54321
12345
54321

 */
public class advptr4 {
    public static void main(String[] args) {
        int n = 16;
        int num = (n/2)-3;
        for (int i = 1; i <= num; i++) {
            if(i %2 == 1) {
                for (int j = num; j >=1 ; j--) {

                    System.out.print(j);
                }
            }
            else {
                for (int j = 1; j <=num ; j++) {
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
}
