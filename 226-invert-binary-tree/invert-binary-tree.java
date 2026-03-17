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
    public TreeNode invertTree(TreeNode root) {
        // time : O(n), n = no of nodes in the tree
        // space : O(n), n = height of the tree - basically stack space

        // dfs breaking point
        if(root == null) return null;

        // recursion stack
        TreeNode leftRoot = invertTree(root.left);
        TreeNode rightRoot = invertTree(root.right);

        // swap
        root.left = rightRoot;
        root.right = leftRoot;

        return root;
    }
}