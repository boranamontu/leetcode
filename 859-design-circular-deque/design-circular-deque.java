import java.util.*;
class MyCircularDeque {
    Deque<Integer> d1;
    int size = 0;
    public MyCircularDeque(int k) {
        size = k;
        d1=new LinkedList<>();
    }
    
    public boolean insertFront(int value) {
        if(size != d1.size()){
            d1.addFirst(value);
            return true;
        }
         return false;

    }
    
    public boolean insertLast(int value) {
         if(size != d1.size()){
            d1.addLast(value);
            return true;
        }
         return false;
        
    }
    
    public boolean deleteFront() {
        if(!d1.isEmpty()){
            d1.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!d1.isEmpty()){
            d1.removeLast();
            return true;
        }
        return false;
        
    }
    
    public int getFront() {
        if(!d1.isEmpty()){
            return d1.getFirst();
        }
        return -1;
    }
    
    public int getRear() {
        if(!d1.isEmpty()){
            return d1.getLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return d1.isEmpty();
    }
    
    public boolean isFull() {
        return size == d1.size();
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */