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
 
     public static void helper(TreeNode root,Stack<Integer> s){
        if(root==null) return ;

           
             
             helper(root.right,s);
              s.push(root.val + s.pop());
               root.val = s.peek();
              helper(root.left,s);
    }
    public TreeNode bstToGst(TreeNode root) {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        helper(root,s);
        return root;
    }
}