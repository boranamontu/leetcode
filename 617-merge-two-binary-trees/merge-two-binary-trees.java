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
    public static TreeNode merge(TreeNode root1, TreeNode root2, TreeNode newnode) {
        if (root1 == null && root2 == null) {
            return newnode;
        }
        if (root1 != null && root2 == null) {
            newnode = root1;
            return newnode;
        } else if (root1 == null && root2 != null) {
            newnode = root2;
            return newnode;
        }

        newnode = new TreeNode(root1.val + root2.val);

        newnode.left = merge(root1.left, root2.left, newnode.left);
        newnode.right = merge(root1.right, root2.right, newnode.right);
        return newnode;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode newnode = merge(root1, root2, null);
        return newnode;
    }
}