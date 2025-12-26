import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[temp.length];
        for(int i=ans.length-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i]=0;
                s.push(i);
            }else if(temp[i]>=temp[s.peek()]){
                     while(!s.isEmpty()){
                        if(temp[i]>=temp[s.peek()]){
                            s.pop();
                        }else{
                            break;
                        }
                        
                     }
                     if(s.isEmpty()){
                      ans[i]=0;
                        s.push(i);
                     }
                    //  else{
                    //     ans[i]=s.peek()-i;
                    //     s.push(i);
                    //  }
            }
            if(temp[i]<temp[s.peek()]){
                 ans[i]=s.peek()-i;
                        s.push(i);
            }

        }
        return ans;
    }
}