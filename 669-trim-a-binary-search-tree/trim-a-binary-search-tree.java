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
    public static TreeNode helper(TreeNode root, int low, int high,Stack<TreeNode> s){
         if(root == null) return null;

        if(root.val < low){

            if( root.right != null && root.right.val < low ){
                  while(root.right != null && root.right.val < low ){
                    root = root.right;
                  }
            }
            return   helper(root.right, low, high,s);
            
        }

        if(root.val > high){
            if( root.left != null && root.left.val > high ){
                  while(root.left != null && root.left.val > high  ){
                    root = root.left;
                  }
            }
               return helper(root.left, low, high,s);
        }
        
         root.left = helper(root.left, low, high,s);
         
         
         root.right = helper(root.right, low, high,s);

        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
          Stack<TreeNode> s=new Stack<>();
          s.push(root);
        return helper( root,low,  high,s);
       
    }
}