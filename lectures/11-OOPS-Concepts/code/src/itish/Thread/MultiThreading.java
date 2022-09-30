package itish.Thread;

public class MultiThreading  {
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {
            MultiThreadinThings mything = new MultiThreadinThings(i);
            mything.start();
        }

//        MultiThreadinThings mything2 = new MultiThreadinThings();

//        mything.start();
//        mything2.start();
    }
}
