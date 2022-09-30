package DataStructures.LinkedList;

public class MyDoublyLinkedList {
    Node head;



    class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }

    // Adding elements
    public void add(Object obj) {
        Node n = new Node(obj);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev= temp;
    }

    // display
    public  String toString(){
        String st = "[";
        Node temp= head;
        while (temp!=null){
            st=st+temp.data;
            if(temp.next!=null)
                st=st+"=>";
            temp=temp.next;

        }
        return st+"]";

    }
    // adding in first
    public void addFirst(Object obj) {
        Node n =new Node(obj);
        n.next=head;

        if(head!=null)
            head.prev=n;
        head=n;
    }
    // delete in first
    public Object deleteFirst() {
        if(head==null) {
            System.out.println("list is empty");
            return "";
        }
        Object data = head.data;
        head=head.next;
        if(head!=null) {
            head.prev = null;
        }
        return data;
    }

    // deleteLast
    public Object deleteLast() {
        if(head==null){
            System.out.println("list is empty");
            return "";
        }

        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        if(temp.prev!=null)
            temp.prev.next=null;
        else
            head=null;

        return temp.data;
    }

    // insert at a perticular Index
    public void add(Object obj,int in){
        if(in==0) {
            addFirst(obj);
            return;
        }

        Node temp = head;
        while (temp.next!=null && in>1){
            temp = temp.next;
            in--;
        }
        if(in==1&& temp!=null){
            Node n = new Node(obj);
            n.prev=temp;
            n.next=temp.next;
            temp.next=n;
            if(n.next!=null)
                n.next.prev=n;
        }
        else {
            System.out.println("Index not in the range... ");
        }

    }
    public Object delete(int in){
        if(in==0){
            return deleteFirst();
        }
        Node temp=head;
        while (temp!=null && in > 0){
            temp=temp.next;
            in--;
        }
        if(temp== null){
            System.out.println("index not in range");
            return " ";
        }
        temp.prev.next = temp.next;
        if(temp.next!=null)
            temp.next.prev= temp.prev;
        return temp.data;


    }

    // reverse Dll
    public void reverse(){
        Node temp=head;
        Node th = head;
        while (temp!=null){
            th=temp;
            Node curr = temp.next;
            temp.next=temp.prev;
            temp.prev=curr;
            temp=curr;
        }
        head=th;
    }


}
