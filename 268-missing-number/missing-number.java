class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 1){
            return 0;
        }
        int max_val = nums.length;
        int num_cnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
           
            num_cnt = num_cnt + nums[i];
        }
        int max_cnt = 0;
        while(max_val != 0){
            max_cnt += max_val;
            max_val--;
        }
        return Math.abs(num_cnt - max_cnt);
    }
}