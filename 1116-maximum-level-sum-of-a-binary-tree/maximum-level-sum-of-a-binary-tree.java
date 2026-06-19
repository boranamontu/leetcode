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
    public static int bfs(TreeNode root,Queue<TreeNode> q){
        int max = q.peek().val;
        int sum = 0;
        int level = 1;
        int l  = 1;
        while(!q.isEmpty()){
            if(q.peek() == null){
                if(max < sum){
                    max = Math.max(sum,max);
                    level = l;
                }
                l++;
                sum = 0;
                q.add(q.remove());
                if(q.size()==1){
                return level;
            }
            }
            
            sum = sum + q.peek().val;
            if(q.peek().left != null){
                q.add(q.peek().left);
            }
            if(q.peek().right != null){
                q.add(q.peek().right);
            }
            q.remove();
        }
        return level;
    }
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        return bfs(root,q);

    }
}