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
    public List<Integer> helper(TreeNode root,List<Integer> ll){
        if(root==null){
            return null;
        }
        ll.add(root.val);
        helper(root.left,ll);
        helper(root.right,ll);
        return ll;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        if(root==null){
            return ll;
        }
        return helper(root,ll);
    }
}