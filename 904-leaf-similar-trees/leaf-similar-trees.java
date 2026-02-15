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

    public static void leafstore(TreeNode root,Stack<TreeNode> s){
        if(root==null ){
            return;
        }
      if(root.left==null && root.right==null){
        s.push(root);
        return;
      }
      leafstore(root.left, s);
      leafstore(root.right, s);
      return;

    }
    public static boolean leafSimilar(TreeNode root1,TreeNode root2){
          Stack<TreeNode> s1=new Stack<>();
          Stack<TreeNode> s2=new Stack<>();

          leafstore(root1,s1);
          leafstore(root2,s2);
          while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek().val !=s2.peek().val){
              break;
            }
            s1.pop();
            s2.pop();
          }
          if(s1.isEmpty() && s2.isEmpty()){
          return true;
          }else{
            return false;
          }



    }
}