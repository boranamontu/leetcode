class Solution {
    public String removeStars(String str) {
        Stack<Character> s1=new Stack<>();
       
         StringBuilder sb=new StringBuilder();
        
         for(int i=str.length()-1;i>=0;i--){
            if(s1.isEmpty()){
                 s1.push(str.charAt(i));
            }else if(s1.peek()=='*' &&  str.charAt(i)!='*'){
                s1.pop();
            }else if(s1.peek()=='*' && str.charAt(i)=='*'){
                s1.push(str.charAt(i));
            }else{
                 s1.push(str.charAt(i));
            }
         }
         while(!s1.isEmpty()){
            sb.append(s1.peek());
            s1.pop();
         }
         return sb.toString();
    }
}