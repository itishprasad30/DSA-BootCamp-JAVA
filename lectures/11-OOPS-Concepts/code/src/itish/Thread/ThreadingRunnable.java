package itish.Thread;

public class ThreadingRunnable implements Runnable{
    private int threadNumber;
    public ThreadingRunnable(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <=4 ; i++) {
            System.out.println(i + " thread number "+ threadNumber);
            if(threadNumber == 3){
//                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
