package DataStructures.Stack;

import java.util.Arrays;

public class MyStack {
    int capacity;
    int top=-1;
    Object stk [];

    public MyStack(int capacity) {
        this.capacity = capacity;
        stk = new Object[capacity];
    }

    // push method
    public void push(Object ele){
        if(top == capacity-1){
            System.out.println("Stack underFlow ");
            return;
        }

        stk[++top] = ele;
    }
    // pop method
    public Object pop(){
        if(top == -1){
            System.out.println("Stack underFlow");
            return " ";
        }
        return stk[top--];
    }
    // peek method
    public Object peek(){
        if(top==-1){
            System.out.println("Stack underFlow");
            return " ";
        }
        return stk[top];
    }
    // size ()
    public int size(){
        return top+1;
    }

    @Override
    public String toString() {
       String st = "[";
        for (int i = 0; i <= top; i++) {
            st = st+stk[i] + " ";

        }
        return st+"]";
    }
}
