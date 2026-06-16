class Solution {
    public String reverseWords(String s) {
          String ans="";
       Queue<String> q = new LinkedList<>();
       Stack<String> sta = new Stack<>();
       for(int i = 0 ; i < s.length();i++){
              q.add(String.valueOf(s.charAt(i)));
       }

       StringBuilder sb = new StringBuilder();
      while(!q.isEmpty()){
       
       if(" ".equals(q.peek())){
              
              while(!q.isEmpty() && " ".equals(q.peek())){
                     q.remove();
              }
       }
       //non space
       if(!q.isEmpty() && !" ".equals(q.peek())){
              while(!q.isEmpty() && !" ".equals(q.peek())){
                     
                     sb.append( q.remove()) ;
                     
              }
              if(!q.isEmpty() && !" ".equals(q.peek()) ){
                     sb.append("_");
              }
              sta.push(sb.toString());
              sb = new StringBuilder();
              
       }
       
      }
       
while(!sta.isEmpty()){
       sb.append(sta.pop()+" ");
 }
      return sb.substring(0,sb.length()-1);
    }
}