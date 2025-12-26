import java.util.*;
class Solution {
    public int minLengthAfterRemovals(String str) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int ac=0;
        int bc=0;
        int cnt=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                ac++;
            }else{
                bc++;
            }
             s1.push(str.charAt(i));
        }
        if(ac==0 || bc==0){
            if(ac>0){
                return ac;
            }else{
                return bc;
            }
        }
        if(ac>bc){
          count=bc+ac;
            ac=bc;
        }else if(ac<bc){
           count=ac+bc;
           bc=ac;
        }else if(ac==bc){
            count=ac+bc;
        }
        while(count!=0 && !s1.isEmpty()){
            if(s1.peek()=='a'){
                if(ac==0){
                    s2.push(s1.peek());
                    cnt++; 
                    s1.pop();
                }else{
                ac--;
                s1.pop();
                }
            }else{
                 if(bc==0){
                    s2.push(s1.peek());
                    cnt++;
                    s1.pop();
                }else{
                bc--;
                s1.pop();
                }
            }
            count--;
        }
        if(s1.isEmpty() && s2.isEmpty()){
            return 0;
        }else
        return cnt;
    }
}