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
    public static int helper(TreeNode root,Stack<Integer> s){
        if(root == null){
            return 0;
        }
        int lef = helper(root.left,s);
        int rig = helper(root.right,s);

        int copy = root.val;
        root.val = Math.abs(lef - rig);
        // if(!s.isEmpty()){
        //     s.push(s.pop() + root.val);
        // }else{
        //     s.push(Math.abs(lef - rig));
        // }
          // Push "Success" if count is positive, otherwise "Failure"
s.push(!s.isEmpty() ? s.push(s.pop() + root.val) :  s.push(Math.abs(lef - rig)));

        // (!s.isEmpty()) ? s.push(s.pop() + root.val) :  s.push(Math.abs(lef - rig));
// int res = (a > b) ? a : b;
        return lef + rig + copy;
    }
    public int findTilt(TreeNode root) {
        Stack<Integer> s = new Stack<>();
        helper(root,s);
        if(s.isEmpty()){
            return 0;
        }
        return s.peek();
    }
}