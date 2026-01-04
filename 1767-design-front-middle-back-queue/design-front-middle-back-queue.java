import java.util.*;
class FrontMiddleBackQueue {
     Deque<Integer> dq1=new LinkedList<>();
     Deque<Integer> dq2=new LinkedList<>();
       int count=0;
    public FrontMiddleBackQueue() {
        
    }
    
    public void pushFront(int val) {
       dq1.addFirst(val);
       count++;
    }
    
    public void pushMiddle(int val) {
        int cnt=0;
         
        while(count/2!=cnt){
         if(dq1.isEmpty()){
               dq1.addFirst(val);
               return;
         }
         int removed=dq1.removeFirst();
            dq2.addFirst(removed);
            cnt++;
        }
           dq1.addFirst(val);
           count++;
           if(!dq2.isEmpty()){
            while(!dq2.isEmpty()){
             int removed2=dq2.removeFirst();
            dq1.addFirst(removed2);
            }
        }

    }
    
    public void pushBack(int val) {
       
         dq1.addLast(val);
         count++;
    }
    
    public int popFront() {
            if(dq1.isEmpty()){
            return -1;
        }
       int frontpop=dq1.removeFirst();
       count--;
       return frontpop;
    }
    
    public int popMiddle() {
         if(dq1.isEmpty()){
            return -1;
        }
            int cnt=0;
            while(count/2!=cnt){
                dq2.addFirst(dq1.removeFirst());
                cnt++;
            }int remove;
            if(count%2==0){
               remove= dq2.removeFirst();
               count--;
            }else{
                remove= dq1.removeFirst();
                count--;
            } if(!dq2.isEmpty()){
            while(!dq2.isEmpty()){
             dq1.addFirst(dq2.removeFirst());
            }
            }
            return remove;
    }
    
    public int popBack() {
          if(dq1.isEmpty()){
            return -1;
        }
  
       count--;
       return dq1.pollLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */