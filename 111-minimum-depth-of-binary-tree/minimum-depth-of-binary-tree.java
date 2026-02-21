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
     public static int minhelp(TreeNode root){
          if((root==null)) return 0;
         
          int lef=0;
         int rig=0;
         if(root.left!=null){
            lef=minhelp(root.left);
         }
         if(root.right!=null){
          rig=minhelp(root.right);
         }
         if(lef==0) return rig+1;
         if(rig==0) return lef+1;
       
         return  Math.min(lef, rig)+1;
      }
      public  int minDepth(TreeNode root) {
         if(root==null) return 0;
         if(root.left==null && root.right==null) return 1;
         int lef=0;
         int rig=0;
         if(root.left!=null){
            lef=minhelp(root.left);
         }
         if(root.right!=null){
          rig=minhelp(root.right);
         }
         if(lef==0) return rig+1;
         if(rig==0) return lef+1;
       
         return  Math.min(lef, rig)+1;
    }
}