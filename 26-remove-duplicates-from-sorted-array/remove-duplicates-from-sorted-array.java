class Solution {
    public int removeDuplicates(int[] nums) {
        int res[] = new int[nums.length];
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        int idx = 0;
        for (int i = 0; i < res.length; i++) {
            if (!hs.contains(nums[i])) {
                res[idx] = nums[i];
                hs.add(nums[i]);
                count++;
                idx++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
        
        
        return count;
    }
}