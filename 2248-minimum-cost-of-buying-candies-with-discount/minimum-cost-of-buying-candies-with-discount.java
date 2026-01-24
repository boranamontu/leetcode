class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
         int ans=0;
        if(cost.length==1){
            ans=cost[0];
            return ans;
        }
        int firstcandy=0;
        int seccandy=0;
        int i=cost.length-1;
       
        while(i>0){
           
            firstcandy=cost[i];
            i--;
            seccandy=cost[i];
              ans=ans+(firstcandy+seccandy);
            i=i-2;
             if(i==0){
                ans=ans+cost[0];
            return ans;
            }
        

        }
        return ans;
    }
}