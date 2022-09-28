package DoublyLinkedList;

public class MyDLL {
    public static void main(String[] args) {
        DLL dl = new DLL();
        dl.insertFirst(32);
        dl.insertFirst(55);
        System.out.println(dl);
        dl.insertLast(22);
        System.out.println(dl);
        dl.display();
        System.out.println(dl);

    }
}
