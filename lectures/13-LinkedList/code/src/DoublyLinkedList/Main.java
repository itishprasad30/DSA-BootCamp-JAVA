package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); // java.lang.Object@7699a589 => fully qualified name and address
        System.out.println(obj.hashCode()); // 1989780873
        System.out.println(0x7699a589); // 1989780873
        System.out.printf("%x",1989780873); //7699a589
    }
}
