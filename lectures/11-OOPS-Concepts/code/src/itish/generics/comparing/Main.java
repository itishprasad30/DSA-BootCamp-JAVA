package itish.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student itish = new Student("Itish",87.4f);
        Student taylor = new Student("Taylor Swift",88.5f);

        if(itish.compareTo(taylor)<0){
            System.out.println("Taylor is greater than itish");
        }
    }
}
