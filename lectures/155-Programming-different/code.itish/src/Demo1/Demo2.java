package StringsPrograms;
/*
Print all numbers between 1 to 100 which are divisible by 7 and must not be divisible by 5 ?
 */

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Demo2 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(k++ + " ");

            }
            System.out.println();
        }



    }
}

//for (int i = 1; i <= 100 ; i++) {
//        if(i % 7 == 0 && !(i %5==0)){
//        System.out.println("number id Divisible by 7 and not by 5 "+ i);
//        }
//
//        }

//        int a = 3;
//        int b = 5;
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println("after swaping : " + a +" "+  b);