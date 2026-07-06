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
    public static void inorder(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
    public boolean isUnivalTree(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        inorder(root,ll);
        int val = ll.get(0);
        for(int i = 0 ; i< ll.size();i++){
            if(ll.get(i) != val){
                return false;
            }
        }
        return true;
    }
}