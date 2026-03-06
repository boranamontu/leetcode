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
   public static void inorder(TreeNode root , List<Integer> ll){
    if(root == null)return;
    inorder(root.left,ll);
    ll.add(root.val);
    inorder(root.right,ll);
   }
    public int minDiffInBST(TreeNode root) {
         List<Integer> ll = new ArrayList<>();
      inorder(root,ll);
      int min = Integer.MAX_VALUE;
     
        for(int i=0;i<ll.size()-1;i++){
             if(min>ll.get(i+1) - ll.get(i)){
                   min=ll.get(i+1) - ll.get(i); 
            }
        }
        return min;
    }
}