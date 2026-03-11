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
    public static int helper(Stack<Integer> s,TreeNode root, int low, int high){
           if(root==null)return 0;

           if(low<root.val && high<root.val){
             helper(s,root.left,low,high);
           }else if(low>root.val && high>root.val){
             helper(s,root.right,low,high);
           }else{

         if(root.val>=low && root.val<=high){
                s.push(s.pop()+root.val);
                
            }
                 helper(s,root.left,low,high);
      
                 helper(s,root.right,low,high);
                     
                
           } 
                 return s.peek();
       

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
     Stack<Integer> s=new Stack<>();
      s.push(0);
     return  helper(s,root,low,high);
      
    }
}