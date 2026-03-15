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
    public static TreeNode helper(TreeNode root, int low, int high){
         if(root == null) return null;

        if(root.val < low){

            if( root.right != null && root.right.val < low ){
                  helper(root.right, low, high);
            }
            return   helper(root.right, low, high);
            
        }

        if(root.val > high){
            if( root.left != null && root.left.val > high ){
                 helper(root.left, low, high);
            }
               return helper(root.left, low, high);
        }
        
         root.left = helper(root.left, low, high);
         
         
         root.right = helper(root.right, low, high);

        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        
        return helper( root,low,  high);
       
    }
}