class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int i=nums.length-1;
        while(k!=0){
            sum=sum+nums[i];
             nums[i]=nums[i]+1;
             k--;

        }
        return sum;
    }
}