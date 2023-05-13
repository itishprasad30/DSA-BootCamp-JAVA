package AfterLife.Stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st);

        MyOwnStack stk = new MyOwnStack(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);

        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println(stk.peek());

    }
}
