class Solution {
    public String reverseWords(String str) {
       String sb = "";
        Stack<String> s = new Stack<>();
        for(int i = str.length()-1 ; i >=0 ; i--){
            if(" ".equals(String.valueOf(str.charAt(i)))){
                
                s.push(sb);
                sb = new String();
            }else{
               
                sb = sb + str.charAt(i);
            }
        }
        s.push(sb);
        String ans = "";
        while(!s.isEmpty()){
            String peek = s.pop();
            if(!s.isEmpty()){
                ans = ans + peek + " ";
            }else{
                ans = ans + peek ;
            }
        }
       return ans;
    }
}