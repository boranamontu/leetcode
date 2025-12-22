import java.util.*;
class MyStack {
      Queue<Integer> q1=new LinkedList<>();
      Queue<Integer> q2=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
        }
        q1.add(x);
        if(!q2.isEmpty()){
            while(!q2.isEmpty()){
                q1.add(q2.peek());
                q2.remove();
            }
        }
    }
    
    public int pop() {
        int peek=q1.peek();
        q1.remove();
        return peek;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */