class Solution {
    public int[] twoSum(int[] nums, int target) {
        int curr=0;
        for(int i=1;i<nums.length;i++){
                
                if(nums[curr]+nums[i]==target){
                    int ans[]=new int[2];
                    ans[0]=curr;
                    ans[1]=i;
                    return ans;
                }
                if(i+1==nums.length){
                    curr++;
                    i=curr;
                }
            }
            return nums;
        }
    }


    
