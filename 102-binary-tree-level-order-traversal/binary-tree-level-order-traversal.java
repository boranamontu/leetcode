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
 
     public static void levelhelper( List<List<Integer>> ll,List<Integer> ll2,Queue<TreeNode> q,    TreeNode root){
         while(q.size()!=1){
               
               if(q.peek()==null){

               }else
               if(q.peek().left!=null && q.peek().right!=null){
               q.add(q.peek().left);
               q.add(q.peek().right);
               }else if(q.peek().left!=null && q.peek().right==null){
                q.add(q.peek().left);
               }else if(q.peek().left==null && q.peek().right!=null){
                q.add(q.peek().right);
               }

               if(q.peek()==null){
                 List<Integer> copy=new ArrayList<>();
                 for(int i=0;i<ll2.size();i++){
                     copy.add(ll2.get(i));
                 }
                 ll.add(copy);
                 ll2.clear();
                q.remove();
                q.add(null);
               }else{
                 ll2.add(q.remove().val);
               }

         }
          List<Integer> copy=new ArrayList<>();
                 for(int i=0;i<ll2.size();i++){
                     copy.add(ll2.get(i));
                 }
                 ll.add(copy);
                 ll2.clear();

         
    }

     public  List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> ll2=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ll;
        q.add(root);
        q.add(null);
        levelhelper( ll, ll2, q,root);
        return ll;

    }
}