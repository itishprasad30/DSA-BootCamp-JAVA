package DoublyLinkedList;

public class DLL {
    Node head;


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if (head == null){
            node.prev=null;
            head=node;
            return;
        }
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }
    public String toString(){
        String st="";
        Node temp = head;
        while (temp!=null){
            st = st+temp.val ;
            if(temp.next != null)
                st=st+" -> ";
            temp = temp.next;
        }
        return st;
    }
    public void display(){
        Node temp= head;
        Node last = null;
        while (temp!= null){
            System.out.print(temp.val + "->");
            last = temp;
            temp= temp.next;
        }
        System.out.println("End");

        System.out.println("Reversal");
        while (last!=null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }


}
