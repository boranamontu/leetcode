class MyCircularQueue {
    Queue<Integer> q;
    int front = 0;
    int rear = 0;
    int size = 0;
    public MyCircularQueue(int k) {
        q = new LinkedList<>();
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(size == q.size()){
            return false;
        }
        if(q.isEmpty()){
            q.add(value);
            front = q.peek();
            rear = q.peek();
            return true;
        }else{
            rear = value;
            q.add(value);
            return true;
        }
        
    }
    
    public boolean deQueue() {
        if(!q.isEmpty()){
            q.remove();
            if(!q.isEmpty()){
                front = q.peek();
            }
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(q.isEmpty()){
            return -1;
        }
        return front;
    }
    
    public int Rear() {
        if(q.isEmpty()){
            return -1;
        }
        return rear;
    }
    
    public boolean isEmpty() {
        return q.isEmpty();
    }
    
    public boolean isFull() {
        return size == q.size();
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */