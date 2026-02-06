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
    public int helper(TreeNode root,int count){
        if(root==null){
            return 0;
        }
        int left=helper(root.left,count);
         int rig=helper(root.right,count);


        return left+rig+1;
    }
    public int countNodes(TreeNode root) {
        int count=0;
        if(root==null){
            return 0;
        }
        return helper(root,count);
    }
}