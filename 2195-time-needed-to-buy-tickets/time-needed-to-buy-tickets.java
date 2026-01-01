import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        int i=0;
        while(i!=tickets.length){
            q.add(i);
            i++;
        }int stepcount=0;
        while(tickets[k]!=0){
            tickets[q.peek()]--;
            if(tickets[q.peek()]==0 ){
              q.remove();
            }else{q.add(q.remove());
            }
            stepcount++;
            
        }
        return stepcount;
    }
}