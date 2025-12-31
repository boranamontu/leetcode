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
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> maxval=new Stack<>();
        ListNode temp=head;
        int n=0;
        //n
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
            n++;
        }
        //max
        temp=head;
        
        int m=n;
        int max=Integer.MIN_VALUE;
        while(m!=n/2 && temp!=null){
           max=temp.val+s.peek();
           maxval.push(max);
           m--;
           temp=temp.next;
           s.pop();
        }max=temp.val+s.peek();
         maxval.push(max);
         s.pop();
         max=Integer.MIN_VALUE;
         while(!maxval.isEmpty()){
              if(max<maxval.peek()){
                max=maxval.peek();
              }
              maxval.pop();
         }
       return max;
        
    }
}