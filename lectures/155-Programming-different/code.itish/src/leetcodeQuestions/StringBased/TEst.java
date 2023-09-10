package leetcodeQuestions.StringBased;

public class TEst implements Poi, Poi.Dao {
    @Override
    public void demo() {
        System.out.println("demo");
    }

    public static void main(String[] args) {
        TEst t = new TEst();
        t.demo();
        t.start();
    }

    @Override
    public void start() {
        System.out.println("start");
    }
}
