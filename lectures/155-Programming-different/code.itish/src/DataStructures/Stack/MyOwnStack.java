package DataStructures.Stack;

import java.util.Stack;

public class MyOwnStack {
    public static void main(String[] args) {
        // normal Stack using the Stack class
//        Stack stk = new Stack();
//        stk.push(32);
//        stk.push(22);
//        System.out.println(stk);
        MyStack stk = new MyStack(5);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.pop();// 5
        stk.pop(); // 4
        System.out.println(stk.peek());//3

        System.out.println(stk);

    }
}





