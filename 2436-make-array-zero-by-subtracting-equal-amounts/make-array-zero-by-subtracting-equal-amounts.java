class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int count=0;
        int map[]=new int[nums[i]+1];
        while(i!=-1){
            if(nums[i]==0){
                return count;
            }
            if(map[nums[i]]==0){
                map[nums[i]]++;
            i--;
               count++; 
            }else{
                i--;
            }
           
        }
        return count;
    }
}