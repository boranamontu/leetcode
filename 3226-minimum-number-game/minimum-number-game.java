class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        int j = 0;
        while(!pq.isEmpty()){
            int first = pq.remove();
            int second = pq.remove();

            nums[j] = second;
            j++;
            nums[j] = first;
            j++;
        }
        // // int arr[] = new int[nums.length];
        // // int j = 0;
        // for(int i=0 ; i<nums.length;i++){
        //     int temp = nums[i];
        //     nums[i] = nums[i+1];
        //     nums[i+1] = temp;
        //     i++;
        // }
        return nums;
    }
}