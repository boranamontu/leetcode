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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        if(head.next == null){
            return head = head.next;
        }
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count %2 != 0){
            count = (count /2)-1;
            temp = head;
            while(count != 0){
                temp = temp.next;
                count--;
            }
            temp.next = temp.next.next;
        }else{
            temp = head;
            count = count/2;
            while(count != 1){
                temp = temp.next;
                count--;
            }
            temp.next = temp.next.next;
        }
      return head;
    }
}