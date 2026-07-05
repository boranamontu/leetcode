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
    public static int max(TreeNode root, int max[]) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, max(root.left, max));
        int right = Math.max(0, max(root.right, max));
        max[0] = Math.max(max[0], left + right + root.val);
        return root.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
       int maxi[] = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        max(root, maxi);
        return maxi[0];
    }
}