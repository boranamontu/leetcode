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

    static class Pair {
        TreeNode node;
        long idx;      // long to avoid overflow

        Pair(TreeNode node, long idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long first = q.peek().idx;   // first index of current level
            long last = first;

            for (int i = 0; i < size; i++) {

                Pair curr = q.poll();

                // Normalize indices to prevent overflow
                long idx = curr.idx - first;
                last = idx;

                if (curr.node.left != null) {
                    q.offer(new Pair(curr.node.left, 2 * idx + 1));
                }

                if (curr.node.right != null) {
                    q.offer(new Pair(curr.node.right, 2 * idx + 2));
                }
            }

            maxWidth = Math.max(maxWidth, (int)(last + 1));
        }

        return maxWidth;
    }
}