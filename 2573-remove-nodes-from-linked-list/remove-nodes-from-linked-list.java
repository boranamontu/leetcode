import java.util.*;
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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s1=new Stack<>();
        //reverse
        ListNode prev=null;
        ListNode curr=head;
        ListNode nxt=null;
        while(curr!=null){
           nxt=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nxt;
        }
        head=prev;
        ListNode temp=head;
        while(temp!=null){
            if( s1.isEmpty()){
            s1.push(temp.val);
            }else if(s1.peek()<=temp.val){
                  s1.push(temp.val);
            }
                temp=temp.next;
        }
          prev=null;
        curr=head;
        nxt=null;
        while(curr!=null){
           nxt=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nxt;
        }
        head=prev;
     
        ListNode newnode=new ListNode(Integer.MIN_VALUE);
        newnode.next=head;   temp=newnode;
        while(temp!=null && temp.next!=null){
           if(temp.next.val!=s1.peek()){
            temp.next=temp.next.next;
            
             
           }else{temp=temp.next; s1.pop();}
        }
      return newnode.next;
    }
}