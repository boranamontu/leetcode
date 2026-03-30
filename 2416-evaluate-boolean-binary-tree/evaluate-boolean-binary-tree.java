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
    public static boolean helper(TreeNode root , boolean lef,boolean rig){
        if(root == null )return true;
        lef = helper( root.left ,  lef, rig);
        rig = helper( root.right ,  lef, rig);

        if(root.val == 1) return true;
        else if(root.val == 0) return false;
        else if(root.val == 2) return lef || rig;
        return lef && rig;
    }
    public boolean evaluateTree(TreeNode root) {
        return helper( root , true,true);
        
    }
}