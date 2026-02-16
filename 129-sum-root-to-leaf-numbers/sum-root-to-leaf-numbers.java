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
      public static int helpersum(TreeNode root,int sum){
       if(root==null) return 0;
       if(root.left==null && root.right==null){
        sum=(sum*10)+root.val;
        return sum;
       }
       sum=(sum*10)+root.val;
       int lef=helpersum(root.left, sum);
       int rig=helpersum(root.right, sum);
       return lef+rig;
    }
    public int sumNumbers(TreeNode root) {
         int sum=0;
      return helpersum(root,sum);
    }
}