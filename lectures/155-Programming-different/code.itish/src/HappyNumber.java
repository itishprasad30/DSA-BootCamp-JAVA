public class HappyNumber {

    static  int isHappyNum(int n){
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum = sum +( rem * rem);
            n /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 49;
        int result = num;
        while (result!=1 && result!=4){
            result = isHappyNum(result);
        }

        if (result == 1)
            System.out.println(num+ " Is a happy Number ");
        else if (result == 4)
            System.out.println(num + " is not a happy Number");

    }
    static  boolean isHappry(int n){
        while (n > 9){
            int sum= 0;
            do{
                int r = n% 10;
                sum = sum+ r;
                n = n/10;
            }while (n!=0);
            n = sum;
        }

        return n == 1|| n ==7;
    }

}
