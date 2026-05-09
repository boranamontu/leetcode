class Solution {
    public static int signFunc(int pro){
         if(pro > 0){
            return 1;
        }else if(pro < 0){
            return -1;
        }
            return 0;
        
    }
    public int arraySign(int[] nums) {
        int pro = 1;
        for(int i = 0;i < nums.length;i++){
           if(nums[i] > 0){
             pro = pro * 1;
           }else if(nums[i] < 0){
             pro = pro * -1;
           }else{
            pro = pro * 0;
           }
        }
        return pro;
    }
}