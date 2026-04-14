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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        int count = a;
        while(count != 1){
            temp1 = temp1.next;
            count--;
        }
        ListNode temp2 = temp1.next;
        while(a != b){
            temp2 = temp2.next;
            a++;
        }
        temp1.next = list2;
        ListNode tail = list2;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = temp2.next;
        return list1;
    }
}