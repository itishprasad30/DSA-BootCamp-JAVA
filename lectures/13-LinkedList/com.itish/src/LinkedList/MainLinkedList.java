package LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.insertLast(12);
        ll.insertLast(76);
        ll.insertLast(98);
        System.out.println(ll);
        ll.insertFirst(76);
        ll.insertFirst(45);
        System.out.println(ll);
        ll.insert(55,3);
        System.out.println(ll);
        ll.delete(4);
        System.out.println(ll);

    }
}
