class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=1;
        int mark=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target && mark==1){
                pos=i;
                mark=0;
            }
        }
        if(mark==1){
            return nums.length;
        }
        return pos;
    }
}