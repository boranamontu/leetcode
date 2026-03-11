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
    public static int helper(List<Integer> ll,TreeNode root, int low, int high){
           if(root==null)return 0;

        //    if(low<root.val && high<root.val){
        //      helper(sum,root.left,low,high);
        //    }else if(low>root.val && high>root.val){
        //      helper(sum,root.right,low,high);
        //    }else{
        //     if(root.val>=low || root.val<=high){
        //          sum=sum+root.val;
                
        //     }
            
        //          helper(sum,root.left,low,high);
      
        //          helper(sum,root.right,low,high);
      
        //    }

         if(root.val>=low && root.val<=high){
                 ll.add(root.val);
                
            }
                        helper(ll,root.left,low,high);
      
                 helper(ll,root.right,low,high);
                       int sum=0;
                 for(int i=0;i<ll.size();i++){
                    sum=sum+ll.get(i);
                 }
                 return sum;
       

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
      List<Integer> ll=new ArrayList<>();
     return  helper(ll,root,low,high);
      
    }
}