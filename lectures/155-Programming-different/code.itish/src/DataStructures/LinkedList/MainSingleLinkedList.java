package DataStructures.LinkedList;

public class MainSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(45);
        sl.add(12);
        sl.add(54);
        System.out.println(sl); //45->12->54
        sl.addFirst(33);
        System.out.println(sl); //33->45->12->54
        System.out.println(sl.deleteFirst()); // remove the ->>>  33
        System.out.println(sl); //45->12->54
        System.out.println(sl.deleteLast()); // remove the --->>> 54
        sl.add(45);
        sl.add(12);
        sl.add(54);
        System.out.println(sl);
        System.out.println(sl.sum());

        System.out.println(sl.middleData());
       sl.reverse();
        System.out.println(sl);

    }
}
