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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        int lcd = 1;
        
        while(temp2 != null){
          int i = 1;
          while(i<=Math.min(temp1.val,temp2.val)){
            if(temp1.val % i==0 && temp2.val%i==0 ){
                lcd = i;
            }
            i++;
          }
          ListNode newnode = new ListNode(lcd);
          temp1.next = newnode;
          newnode.next = temp2;
          temp1=temp2;
          temp2=temp1.next;
        }
        return head;
    }
}