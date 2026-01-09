import java.util.*;
class MinStack {
     Stack<Integer> s=new Stack<>();
     Stack<Integer> mins=new Stack<>();
     int min=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
       if(mins.isEmpty() ){
        mins.push(val);
          s.push(val);
       }else if(mins.peek()>=val){
         mins.push(val);
          s.push(val);
       }else{
        s.push(val);
       }
     

    }
    
    public void pop() {
        if(s.isEmpty()){
            return;
        } int stop=s.peek();
        int mintop=mins.peek();
       if(stop==mintop){
        mins.pop();
       }
        s.pop();
       
    }
    
    public int top() {
         if(s.isEmpty()){
            return 0;
        }
         return s.peek();
    }
    
    public int getMin() {
       
      return mins.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */