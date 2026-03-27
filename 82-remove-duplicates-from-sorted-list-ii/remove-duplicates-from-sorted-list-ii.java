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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        head = prev;
       
        ListNode curr = head.next;
        while(curr != null && curr.next != null){
            if(curr.next != null && curr.val != curr.next.val){
                curr = curr.next;
                prev = prev.next;
            }else if(curr.next != null && curr.val == curr.next.val){
                ListNode copy = curr;
                while(curr != null && curr.val == copy.val){
                    curr = curr.next;
                }
                prev.next = curr;
            }
        }

         return head.next;


    }
}