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
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        //reverse
        ListNode lc=head;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode nxt;
        int count=1;
         ListNode pc=head;
        while(length>=k){
            count=1;
            prev=lc;
            curr=lc.next;
        while(count!=k ){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            count++;
            
        } 
        if(lc==head){
            head=prev;
            lc.next=curr;
        }else{
            pc.next=prev;
             lc.next=curr;
        }pc=lc;
        length=length-k;
        lc=lc.next; 
        }
       return head;

    }
}