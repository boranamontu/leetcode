class Solution {
    public int[] diStringMatch(String s) {
        int ans[]=new int[s.length()+1];
        int I=0;
        int D=ans.length-1;
        for(int i=0;i<ans.length;i++){
            if(i==ans.length-1){
                ans[i]=I;
            }else
            if(s.charAt(i)=='I'){
                ans[i]=I;
                I++;
            }else{
                ans[i]=D;
                D--;
            }
        }
        return ans;
    }
}