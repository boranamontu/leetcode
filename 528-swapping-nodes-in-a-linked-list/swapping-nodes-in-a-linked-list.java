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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 1;
        ListNode temp1 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        int count = size-k;
        temp1 = head;
        ListNode temp2 = head;
        while(k != 1 || count != 1){
            if(k != 1 && count != 1){
                temp1 = temp1.next;
                temp2 = temp2.next;
                k--;
                count--;
            }else if(count != 1){
                temp2 = temp2.next;
                count--;
            }else if(k != 1){
                temp2 = temp2.next;
                k--;
            }
        }
        int copy = temp1.val;
        temp1.val = temp2.val;
        temp2.val = copy;
        return head;
    }
}