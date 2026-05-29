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
    public ListNode mergeNodes(ListNode head) {
        ListNode prepointer = head;
        boolean headfit = false;
        ListNode temp = head;
        int sum = 0;
        while(temp != null && temp.next != null){
            if(temp.val != 0){
                sum = sum + temp.val;
                temp = temp.next;
            }
            if(temp.val == 0 ){
                if( temp != head ){
                temp.val = sum;
                sum = 0;
                }
                if(head.val == 0 && headfit == false){
                    prepointer = temp;
                    headfit = true;
                    head = temp;
                }
                if(temp != prepointer){
                    prepointer.next = temp;
                    prepointer = temp;
                }
                temp = temp.next;
            }
        }
        return head.next;
    }
}