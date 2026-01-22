class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int map[]=new int[9];
        // for(int i=0;i<nums.length;i++){
        //     if(map[nums[i]]==0){
        //         map[nums[i]]++;
        //     }else{
        //         return true;
        //     }
        // }
        // return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                return false;
            }
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}