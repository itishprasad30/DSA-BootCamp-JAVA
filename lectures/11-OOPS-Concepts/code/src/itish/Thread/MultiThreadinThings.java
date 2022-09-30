package itish.Thread;

public class MultiThreadinThings extends Thread {
    private int threadNumber;
    public MultiThreadinThings(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + " thread number "+ threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }
}
