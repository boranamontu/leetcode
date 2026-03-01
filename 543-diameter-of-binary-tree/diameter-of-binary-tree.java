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
    public static int helper(TreeNode root,List<Integer> ll){
        if(root==null) return 0;
        int lef=helper(root.left,ll);
        int rig=helper(root.right,ll);
          
          ll.add(lef+rig);
        return Math.max(lef,rig)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        List<Integer> ll=new ArrayList<>();
        
       helper(root,ll);
       Collections.sort(ll);
       int ans=ll.get(ll.size()-1);
       return ans;

    }
}