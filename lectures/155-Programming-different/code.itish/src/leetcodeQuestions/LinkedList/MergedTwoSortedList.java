package leetcodeQuestions.LinkedList;
/*
21. Merge Two Sorted Lists
Easy

15158

1331

Add to List

Share
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */
public class MergedTwoSortedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode current2 = new ListNode(10000);
            ListNode current = current2;
            ListNode next1 = list1, next2 = list2;

            while( next1 != null && next2 != null && current != null){
                if(next1.val <= next2.val){
                    current.next = next1;
                    current = current.next;
                    next1 = next1.next;
                }else{
                    current.next = next2;
                    current = current.next;
                    next2 = next2.next;
                }
            }

            while(next1 != null){
                current.next = next1;
                current = current.next;
                next1 = next1.next;
            }

            while(next2 != null){
                current.next = next2;
                current = current.next;
                next2 = next2.next;

            }

            current2 = current2.next;

            return current2;

        }

}
