class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            esum = esum + nums[i];
            int n = nums[i];
            while(n != 0){
                dsum = dsum + n % 10;
                n = n/10;
            }
        }
        return Math.abs(esum - dsum);
    }
}