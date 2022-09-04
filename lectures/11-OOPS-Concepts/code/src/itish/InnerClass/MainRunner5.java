package itish.InnerClass;

public class MainRunner5 {
    public static void main(String[] args) {
        // anonymous class - only one time it created for every object different should created.

        // after the createing object obj of interface you have to provide the body for that
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println("INSIDe the Runner class");
            }
        };

        rn.run();
    }
}
