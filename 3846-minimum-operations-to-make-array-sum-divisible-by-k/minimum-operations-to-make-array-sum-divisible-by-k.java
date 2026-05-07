class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
        }
        int count = 0;
        while(sum % k != 0){
            sum = sum - 1;
            count++;
        }
        return count;
    }
}