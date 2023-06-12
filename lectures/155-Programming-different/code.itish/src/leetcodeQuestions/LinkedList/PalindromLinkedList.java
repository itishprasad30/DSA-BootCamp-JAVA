package leetcodeQuestions.LinkedList;

/*
Palindrome Linked List
Easy
14.2K
774
Companies
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 */
public class PalindromLinkedList {
    public boolean isPalindrom(ListNode head ){
        // find the middle
        // reverse the 2nd half
        // check if first one is equal with second one
        if(head == null && head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverse(middle.next);
        ListNode firstHalf = head;

        while (secondHalf!= null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    static ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while (hare!= null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
