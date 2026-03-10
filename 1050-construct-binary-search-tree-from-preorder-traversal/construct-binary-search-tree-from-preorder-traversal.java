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
    public static TreeNode build(TreeNode root,int value){
        if(root==null)return new TreeNode(value);
        if(value<root.val){
            root.left=build( root.left, value);
        }else
        root.right=build( root.right,value);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=build(root,preorder[i]);
        }
        return root;
    }
}