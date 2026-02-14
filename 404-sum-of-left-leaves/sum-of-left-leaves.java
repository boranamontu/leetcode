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
   public static int help(TreeNode curr,TreeNode parent){
    if(curr==null){
        return 0;
    }
    //leaf node
    if(curr.left==null && curr.right==null){
        if(parent!=null && parent.left==curr){
            return curr.val;
        }
    }
    int left=help(curr.left,curr);
    int right=help(curr.right,curr);
    return left+right;
   }
   
    public static int sumOfLeftLeaves(TreeNode root) {
          return help(root,null);
    }
}