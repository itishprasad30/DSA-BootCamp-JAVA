package AfterLife.Stack;

public class MyOwnStack {
    int top=-1;
    int capacity;
    Object[] stk;

    public MyOwnStack(int capacity){
        this.capacity = capacity;
        stk = new Object[capacity];
    }

    // push
    public void push(Object obj){
        if(top == capacity-1){
            System.out.println("stack underflow");
            return ;
        }
        stk[++top] = obj;
    }
    // pop
    public Object pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return " ";
        }
        return stk[top--];
    }
    // peek
    public Object peek(){
        if (top == -1){
            System.out.println("stack underflow");
            return " ";
        }
        return stk[top];
    }

    public String toString(){
        String  st = "[";
        for(int i=0;i<=top;i++){
            st = st + stk[i]+", " ;
        }
        return st+ "]";
    }


}
