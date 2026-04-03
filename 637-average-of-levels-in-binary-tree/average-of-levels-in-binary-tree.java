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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> ll = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        q.add(null);
        while(q.size() != 1){
            if(q.peek() != null){
                TreeNode node = q.peek();
                s.push(q.peek().val);
                q.remove();
                if(node.left != null && node.right != null){
                    q.add(node.left);
                    q.add(node.right);
                }else if(node.left != null){
                    q.add(node.left);
                }else if(node.right != null){
                    q.add(node.right);
                }
            }else if(q.peek() == null){
                q.add(q.remove());
                double avg = 0;
                int size = s.size();
                int up = s.peek();
                while(!s.isEmpty()){
                    avg = avg + s.pop();
                }
                if(avg != 0 || up == 0){ 
                    ll.add(avg / size);
                }  
            }

        }
                if(!s.isEmpty()){
                    double avg = 0;
                int size = s.size();
                int up = s.peek();
                while(!s.isEmpty()){
                    avg = avg + s.pop();
                }
               
                    ll.add(avg / size);
           
                }        
        return ll;
    }
}