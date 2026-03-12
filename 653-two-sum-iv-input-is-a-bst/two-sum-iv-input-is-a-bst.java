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

    public static boolean helper(TreeNode root, int k,List<Integer> ll){
        if(root==null) return true;
        helper(root.left,  k, ll);
        ll.add(root.val);
        helper(root.right,k,ll);

        return true;

    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ll=new ArrayList<>();
        
        helper( root, k,ll);
        int ans=0;
        if(ll.size()<=1) return false;
        for(int i=0;i<ll.size();i++){
            int curr=ll.get(i);
            for(int j=0;j<ll.size();j++){
                  if(curr+ll.get(j)==k && i!=j){
                    ans=curr+ll.get(j);
                    break;
                  }
            }
        }
        
        return ans!=0;
        
    }
}