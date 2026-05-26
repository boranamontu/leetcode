/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static void  helper(final TreeNode cloned,TreeNode root,final TreeNode target,Stack<TreeNode> s){
       if(root == null){
        return ;
       }
       if(root.val == target.val){
        s.push(root);
        return ;
       }else{
       helper(cloned,root.left,target,s);
       helper(cloned,root.right,target,s);
       }
       return ;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode root = cloned;
        Stack<TreeNode> s = new Stack<>();
        helper(cloned,root,target,s);
        if(!s.isEmpty()){
            return s.peek();
        }else{
            return root;
        }
         
    }
}