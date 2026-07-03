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
   public static boolean check(TreeNode root, TreeNode subtree) {
        if (root == null) {
            return false;
        }
        if (root.val == subtree.val) {
           boolean res = found(root, subtree);
           if(res == true){
            return true;
           }
        }
        return check(root.left, subtree) || check(root.right, subtree);
    }

    public static boolean found(TreeNode root, TreeNode subtree) {
        if (root == null && subtree == null) {
            return true;
        } else if (root == null || subtree == null) {
            return false;
        }
        if(root.val != subtree.val){
            return false;
        }
        return found(root.left, subtree.left) && found(root.right, subtree.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       return check(root, subRoot);
           
    }
}