package DataStructures.Queue;

import java.util.Arrays;

public class Myque {
    private int front,rear,capcity;
    private Object []obj;

    public Myque(int capcity) {
        this.capcity = capcity;
        front = rear = -1;
        obj = new Object[capcity];
    }
    public void enque(Object ele){
        if(rear == capcity-1){
            System.out.println("queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        obj[++rear] = ele;
    }
    public Object deque(){
        if(front == -1){
            System.out.println("queue is empty ");
            return null;
        }
        Object ele = obj[front++];
        if(front >= rear)
            front=rear = -1;
        return ele;
    }

    @Override
    public String toString() {
       String st = "[";
        for (int i = front; i <= rear ; i++) {
            st = st + obj[i]+ ",";
        }
        return st + "]";
    }
    public int size(){
        if(front== -1)
            return 0;
        return front -rear +1;
    }
}
