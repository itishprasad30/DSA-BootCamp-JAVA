package itish.InnerClass.AnonymusClass;

public class Main {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println(s1); // itish.InnerClass.AnonymusClass.Sample@58372a00

        // i want to print only hi in s2 -- override the toString method
        Sample s2 = new Sample(){
            @Override
            public String toString(){
                return "hi";
            }

        };
        System.out.println(s2); // hi
    }
}
