package itish.Thread;

import java.util.concurrent.Callable;

public class TheadingRun {
    public static void main(String[] args) {
        for (int i = 0; i <=3 ; i++) {
            ThreadingRunnable mythings = new ThreadingRunnable(i);
            Thread th = new Thread(mythings);
            th.start();
        }

        //throw new RuntimeException();
    }
}
