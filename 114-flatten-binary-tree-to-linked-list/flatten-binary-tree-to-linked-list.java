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
  
     public  void fh(TreeNode root, Queue<TreeNode> q){
         if(root==null){
          return;
         }
         q.add(root);
         fh(root.left, q);
         fh(root.right, q);
   }
   public  void flatten(TreeNode root){
    if(root==null) return;
    if(root.left==null && root.right==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        fh(root,q);
       TreeNode temp=root;
       while(!q.isEmpty()){
        temp.left=null;
        temp.right=q.peek();
        temp=temp.right;
        q.remove();
       }
     
   }
}