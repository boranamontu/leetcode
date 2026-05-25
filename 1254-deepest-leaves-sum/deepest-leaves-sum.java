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
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);//left height
        int rh=height(root.right);//right height
        int height= Math.max(lh,rh)+1;
        return height;
    }
    public static void deepest(TreeNode root,Stack<Integer> s,int height,int count){
      if(root == null){
        return ;
      }
      if(height == count){
        
        if(!s.isEmpty()){
          s.push(s.pop()+root.val);
        }else{
          s.push(root.val);
        }
       
        return ;
        
      }
      System.out.println(count+"c"+root.val);
       deepest(root.left, s, height, count+1);
       deepest(root.right, s, height, count+1);
      
      
    }
    public int deepestLeavesSum(TreeNode root) {
         Stack<Integer> s = new Stack<>();
          deepest(root, s, height(root),1 );
        return s.peek();
    }
}