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
     public static boolean  shelper(TreeNode root1,TreeNode root2,boolean ans){
       if( root1==null && root2==null ) return true;

       if((root1==null && root2!=null) || (root1!=null && root2==null) || (root1.val!=root2.val)){
        ans=false;
        return ans;
       }
      
       return shelper(root1.left, root2.right, ans) && shelper(root1.right, root2.left, ans);
      
       
   }

    public  boolean isSymmetric(TreeNode root) {
        if(root==null){
          return false;
        }
        boolean ans=true;
        
        return shelper(root,root,ans);
    }
}