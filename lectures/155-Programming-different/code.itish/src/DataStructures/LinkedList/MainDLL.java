package DataStructures.LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        MyDoublyLinkedList dl = new MyDoublyLinkedList();
        dl.add(23);
        dl.add(45);
        dl.add(98);
        dl.add(78);
        System.out.println(dl);
        dl.addFirst(11);
        System.out.println(dl);
        System.out.println(dl.deleteFirst());
        System.out.println(dl.deleteLast());
        System.out.println(dl);
        dl.add(33,1);
        System.out.println(dl);
        System.out.println(dl.delete(1));
        dl.reverse();
        System.out.println(dl);
    }
}
