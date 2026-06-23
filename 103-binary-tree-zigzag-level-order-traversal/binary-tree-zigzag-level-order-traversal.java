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
     public static List<List<Integer>> zigzag(TreeNode root){
        
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        List<List<Integer>> ll1 = new ArrayList<>();
        if(root == null){
            return ll1;
        }
        List<Integer> ll2 = new ArrayList<>();
        q.add(root);
        q.add(null);
        ll2.add(root.val);
        ll1.add(ll2);
        ll2 = new ArrayList<>();
        boolean signal = true;
        while(!q.isEmpty()){
            if(q.peek() == null){
                signal = !signal;
                if(s.isEmpty()){
                    q.remove();
                    return ll1;
                }else{
                    while(!s.isEmpty()){
                        ll2.add(s.peek().val);
                        q.add(s.pop());
                    }
                    q.add(q.remove());
                     ll1.add(ll2);
                
                ll2 = new ArrayList<>();
                }
               

            }
            
            if(signal == true){
                if(q.peek().left != null){
                    s.push(q.peek().left);
                }
                if(q.peek().right != null){
                    s.push(q.peek().right);
                }
                
                
                
            }else{
                if(q.peek().right != null){
                    s.push(q.peek().right);
                }
                if(q.peek().left != null){
                    s.push(q.peek().left);
                }
                
               
            }
            q.remove();
        }
        return ll1;

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        return  zigzag(root);
    }
}