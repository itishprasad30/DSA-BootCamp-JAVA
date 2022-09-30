package DataStructures.Queue;


public class MyQueue {
    public static void main(String[] args) {
        Myque qu = new Myque(5);
        qu.enque(12);
        qu.enque(22);
        qu.enque(33);
        qu.enque(44);
        qu.enque(55);
        System.out.println(qu); // 12,22,33,44,55
        qu.deque();
        qu.deque();
        qu.deque();
        System.out.println(qu); // 44 55

    }
}
