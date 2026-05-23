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
    public List<Integer> largestValues(TreeNode root) {
       List<Integer> ll = new ArrayList<>();
                 if(root == null){
                  return ll;
                 }

                Queue<TreeNode> q = new LinkedList<>();
                q.add(root);
                q.add(null);
                while(!q.isEmpty()){
                  int max = Integer.MIN_VALUE;
                  while(q.peek() != null){
                    if(q.peek().val > max){
                      max = q.peek().val;
                    }
                    if(q.peek().left != null){
                      q.add(q.peek().left);
                    }
                    if(q.peek().right != null){
                      q.add(q.peek().right);
                    }
                    q.remove();

                  }
                  ll.add(max);
                  if(q.size() == 1){
                    q.remove();
                  }else{
                    q.add(q.remove());
                  }
                }
                  
                
               
               return ll;
    }
}