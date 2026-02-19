class Solution {
    public static String removeDuplicates(String str) {
        Deque<Character> s=new LinkedList<>();
         for(int i=0;i<str.length();i++){
            if(!s.isEmpty() && s.peek()==str.charAt(i)){
                s.remove();
            }else{
                s.push(str.charAt(i));
                
            }
         }
         String ans="";
         while(!s.isEmpty()){
            ans+=s.removeLast();
         }
         return ans;
       
    }
}