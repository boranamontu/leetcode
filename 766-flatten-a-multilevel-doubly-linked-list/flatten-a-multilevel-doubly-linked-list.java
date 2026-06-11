/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public static void flat(Node head){
        Stack<Node> s = new Stack<>();
        Node temp = head;
        Node tnxt = null;
        while(temp != null){
        if(temp == null && s.isEmpty()){
            return;
        }
        if(temp.next == null && !s.isEmpty()){
            Node nxt = s.pop();
            temp.next = nxt;
            nxt.prev = temp;
            
            
        }
        if(temp.child != null){
            
            if(temp.next != null){
            tnxt = temp.next;
            s.add(tnxt);
            }
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child = null;
            
            
        }
        temp = temp.next;
        }

    }
    public Node flatten(Node head) {
        Node temp = head;
        Node tnxt = null;
        flat( head);
        return head;
        
    }
}