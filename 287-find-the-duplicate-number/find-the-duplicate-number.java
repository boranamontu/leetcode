class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        while(i!=nums.length){
            
            if(nums[i]==nums[i+1]){
                 ans=nums[i];
                return ans;
            }
            i++;
        }
        return ans;
    }
}