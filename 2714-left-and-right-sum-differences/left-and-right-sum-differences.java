class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length];
        int val = 0;
        for(int i = 1 ; i < nums.length ; i++){
            left[i] = nums[i-1] + left[i-1];
        }
        for(int i = nums.length - 1; i >=0 ; i--){
            left[i] = Math.abs(left[i] - val);
            val = val + nums[i];
        }
       
        return left;
    }
}