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
    
      public static int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)){
          return 0;
        }
        int lef=height(root.left);
        int rig=height(root.right);
        int ans=Math.max(lef, rig)+1;
        return ans;

      }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
       
         int lef=height(root.left);
         if(root.left!=null) lef++;
          int rig=height(root.right);
          if(root.right!=null) rig++;
        //   int ans=Math.abs(lef-rig);
        int ans=lef-rig;
        if(ans<0){ ans=-ans;}
          if(ans>1){
            return false;
          }
          return (isBalanced(root.left) && isBalanced( root.right)) ;
    }
}