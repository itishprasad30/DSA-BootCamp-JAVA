package itish.InnerClass;

public class MainRunner4 {
    public static void main(String[] args) {
        // inside the method inner class to be written
        // this is Called local class
        class MyRunnerable implements Runnable{
            @Override
            public void run(){
                System.out.println("Runner is going onnnnn..");
            }
        }

        Runnable rn =new MyRunnerable();
        rn.run();
    }
}
