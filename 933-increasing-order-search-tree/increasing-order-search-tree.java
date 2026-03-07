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
    public static void inorder(TreeNode root, List<TreeNode> ll){
        if(root==null){
            return;
        }
        inorder( root.left, ll);
         ll.add(root);
        inorder( root.right, ll);
    }
    public static  TreeNode reconstruct(TreeNode newroot,List<TreeNode> ll){
        TreeNode prev=null;
        TreeNode nroot=null;
        for(int i=0;i<ll.size();i++){
        if(newroot==null){
          newroot=new TreeNode(ll.get(i).val);
          nroot=newroot;
          prev=newroot;
        }else{
              prev.right=new TreeNode(ll.get(i).val);
              prev=prev.right;
        }
        }
      return nroot;
    }
    public TreeNode increasingBST(TreeNode root) {
        //inorder and store

        List<TreeNode> ll=new ArrayList<>();
        inorder(root,ll);
        //re construct
        TreeNode newroot=null;
         return reconstruct(newroot,ll);
        
        
    }
}