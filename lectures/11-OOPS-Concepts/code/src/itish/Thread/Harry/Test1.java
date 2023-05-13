package itish.Thread.Harry;


class  MyThread extends Thread {
    public void run(){
        int i=0;
        while (i<=300) {
            System.out.println("Thread 1 is Running");
            System.out.println("this is cooking");
            i++;
        }
    }

}

class  MyThread2 extends Thread {
    public void run(){
        int i=0;
        while (i<=300) {
            System.out.println("Thread 2 is Running");
            System.out.println("charting with gf");
            i++;
        }
    }

}


public class Test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
