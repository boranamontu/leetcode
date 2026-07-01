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
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
    public static int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int left = height(root.left);
        int right = height(root.right);
        int self = (left + right);
        return Math.max(ld, Math.max(rd, self));

    }
    public int diameterOfBinaryTree(TreeNode root) {
        return  diameter( root);
    }
}