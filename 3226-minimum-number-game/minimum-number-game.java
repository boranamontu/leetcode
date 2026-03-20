class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i=0 ; i<nums.length;i++){
             int first = nums[i];
             int second =nums[i+1];
             arr[j] = second;
             j++;
             arr[j] = first;
             j++;
             i++;


        }
        return arr;
    }
}