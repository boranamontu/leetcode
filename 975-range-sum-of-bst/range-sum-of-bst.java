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
    public static int helper(List<Integer> ll,TreeNode root, int low, int high,int sum){
           if(root==null)return 0;

           if(low<root.val && high<root.val){
             helper(ll,root.left,low,high,sum);
           }else if(low>root.val && high>root.val){
             helper(ll,root.right,low,high,sum);
           }else{
            
        //          helper(sum,root.left,low,high);
      
        //          helper(sum,root.right,low,high);
      
        //    }

         if(root.val>=low && root.val<=high){
                 ll.add(root.val);
                
            }
                        helper(ll,root.left,low,high,sum);
      
                 helper(ll,root.right,low,high,sum);
                     
                
           } for(int i=0;i<ll.size();i++){
                    sum=sum+ll.get(i);
                 }
                 return sum;
       

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
      List<Integer> ll=new ArrayList<>();
      int sum=0;
     return  helper(ll,root,low,high,sum);
      
    }
}