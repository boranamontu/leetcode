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
    public void helper(TreeNode root, List<String> ll,String str){
        if(root==null) return ;
        if(root.left==null && root.right==null){
                 str+=root.val;
                 ll.add(str);
              
        }
        helper(root.left,ll,str+root.val+"->");
        helper(root.right,ll,str+root.val+"->");
      
    }
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> ll=new ArrayList<>();
         String str="";
         if(root==null){
            return null;
         }

         helper(root,ll,str);
         return ll;
    }
}