class Solution {
    public int sumOfUnique(int[] nums) {
        
        int freq[] = new int[1000];
        for(int i = 0 ; i < nums.length ; i++){
            freq[nums[i]]++;
            
        }
        int sum = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
}