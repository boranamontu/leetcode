class Solution {
    public int lengthOfLastWord(String str) {
     Stack<Integer> s=new Stack<>();
  
     int count=0;

     for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' ' || i==str.length()-1){
            if(i==str.length()-1 && str.charAt(i)!=' '){
                count++;
            }
            if(count==0){

            }else{
            s.push(count);  
            count=0;
            }
        }
        if(str.charAt(i)!=' '){
        count++;
        }
     }   
 
     int ans=s.peek();
     return ans;
    }
}