/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode temp=head;
          
           int arr[][] = new int[m][n];
           if(m == 1 && n == 1){
            if(head != null){
                arr[m-1][n-1] = head.val;
                return arr;
            }
            return arr;
           }
           for(int a = 0 ; a < arr.length;a++){
         for(int b = 0 ; b < arr[0].length;b++){
            arr[a][b] = -1;
         }
         
       }
           
       
        m = arr.length-1;
        n = arr[0].length-1;
       int i = 0;
       int j = 0;
       int level = 0;
        while( temp != null && level <= m - level && level <= n - level){
        //right
        if(i==level && j == level){
            while(temp != null && j <= n-level){
                System.out.println("i="+i+" "+"j="+j);
                System.out.println(temp.val);
                arr[i][j] = temp.val;
                temp = temp.next;
                j++;
               
            }
            j--; // Adjust index back to boundary bounds
            i++; // Shift down to prepare for down movement
        }
        //down
        if( i == level + 1 && j == n-level){
            while(temp != null && i <= m-level){
                System.out.println("i="+i+" "+"j="+j);
                System.out.println(temp.val);
                arr[i][j] = temp.val;
                temp = temp.next;
                i++;
               
            }
            i--; // Adjust index back to boundary bounds
            j--; // Shift left to prepare for left movement
        }
        //left
        if(i == m-level && j == n - level - 1){
            while(temp != null && j >= level){
                System.out.println("i="+i+" "+"j="+j);
                System.out.println(temp.val);
                arr[i][j] = temp.val;
                temp = temp.next;
                j--;
              
            }
            j++; // Adjust index back to boundary bounds
            i--; // Shift up to prepare for upward movement
        }
        //up
        if(i == m-level - 1 && j == level){
            while(temp != null && i > level){
                System.out.println("i="+i+" "+"j="+j);
                System.out.println(temp.val);
                arr[i][j] = temp.val;
                temp = temp.next;
                i--;
              
            }
        }
        
        level++;
        System.out.println("i="+i+" "+"j="+j+"level");
        i = j = level;
       }
      
       
          return arr;
    
    }
}