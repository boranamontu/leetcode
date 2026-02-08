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
      public static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
         return sum(root.left)+sum(root.right)+root.val;

       }
      public static  boolean checkTree(TreeNode root) {
       int lef=sum(root.left);
          int rig=sum(root.right);
       
          return lef+rig==root.val;
    }
}