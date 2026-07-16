class Solution {
    public int missingNumber(int[] nums) {
        int max_val = nums.length;
        int num_cnt = 0;
        int max_cnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
            num_cnt = num_cnt + nums[i];
        }
        while(max_val != 0){
            max_cnt += max_val;
            max_val--;
        }
        return Math.abs(num_cnt - max_cnt);
    }
}