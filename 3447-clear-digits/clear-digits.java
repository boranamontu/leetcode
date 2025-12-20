import java.util.*;
class Solution {
    public String clearDigits(String str) {
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
         s.push(str.charAt(0));
          sb.append(str.charAt(0));
         for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='0' ||str.charAt(i)=='1' ||str.charAt(i)=='2' ||str.charAt(i)=='3' ||str.charAt(i)=='4' ||str.charAt(i)=='5' ||str.charAt(i)=='6' ||str.charAt(i)=='7' ||str.charAt(i)=='8' ||str.charAt(i)=='9' ){
                         s.pop();
                         sb.deleteCharAt(sb.length()-1);
            }else{
                s.push(str.charAt(i));
                sb.append(str.charAt(i));
                
            }
         }
            return sb.toString();
    }
}