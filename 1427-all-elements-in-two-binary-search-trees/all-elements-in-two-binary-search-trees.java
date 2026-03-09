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
    public static void inorder(TreeNode root,List<Integer> ll){
        if(root==null)return ;
        inorder( root.left, ll);
        ll.add(root.val);
        inorder( root.right,ll);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll1=new ArrayList<>();

        inorder(root1,ll1);
        inorder(root2,ll1);
    
        Collections.sort(ll1);
        return ll1;

    }
}