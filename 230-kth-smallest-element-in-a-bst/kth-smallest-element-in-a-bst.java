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
   
     public static int totalNodes(TreeNode root){
        if(root==null){
            return 0;
        }

        int lc=totalNodes(root.left);//left count
        int rc=totalNodes(root.right);//right count
        int total=lc+rc+1;//or node count++ (initialize with 0 at outside of function)
        return total;
        //----------------or----------------------------------
        // return totalNodes(root.left)+totalNodes(root.right)+1;
    }
    public static void helpk(List<Integer> ll,TreeNode root){
        if(root==null){
        
          return;
        }
       
        
           ll.add(root.val);
        helpk(ll, root.left);
        helpk( ll,root.right);
       

    }
   public  int kthSmallest(TreeNode root, int k){
        int size=totalNodes(root);
        List<Integer> ll=new ArrayList<>();
       
        helpk(ll, root);
        Collections.sort(ll);
        int ans=ll.get(k-1);
        return  ans;

   }
}