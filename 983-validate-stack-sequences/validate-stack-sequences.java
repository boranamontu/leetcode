class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
         Stack<Integer> s=new Stack<>();
        int i=0;
        int j=0;
        // if(pushed.length==1 && popped.length==1){
        //     if(pushed[0]==popped[0]){
        //         return true;
        //     }else {
        //         return false;
        //     }
        // }
        while(i!=pushed.length ){
            s.push(pushed[i]);
            if(s.peek()==popped[j]){
                while(s.peek()==popped[j]  && j!=pushed.length) {
                  s.pop();
                  j++; 
                  if(s.isEmpty()){
                   break;
                  }
                  
                }
            }
                i++;
            
        }
           if(s.isEmpty()){
            return true;
           }
       
            return false;
        
    }
}