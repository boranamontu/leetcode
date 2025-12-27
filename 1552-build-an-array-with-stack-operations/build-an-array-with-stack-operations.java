import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> s=new Stack<>();
        ArrayList<String> List=new ArrayList<>();
        int i=0;
        int j=1;
        while(i!=target.length){
            s.push(j);
            List.add("Push");
            if(target[i]!=s.peek()){
                s.pop();
                List.add("Pop");
                i=i-1;
            }
                i++; 
            
            j++; 
        }
        return List;
    }
}