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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static TreeNode helper(List<Integer> ll,int si,int ei){
         if(si>ei) return null;
        int mid=(si+ei)/2;

        TreeNode root=new TreeNode(ll.get(mid));

          root.left=helper(ll,si,mid-1);
          root.right=helper(ll,mid+1,ei);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ll=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ll.add(temp.val);
            temp=temp.next;
        }
        TreeNode root=null;
        int si=0;
        int ei=ll.size()-1;
       return helper(ll,si,ei);
        
    }
}