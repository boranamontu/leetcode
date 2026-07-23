class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int ans[] = new int[nums.length];
        int val = 0;
        int count = 0;
        int i = 0 ;
        int j = 0;
        while(i < nums.length){
            val = nums[i];
            count = 0;
            while( i < nums.length && nums[i] == val){
                count++;
                i++;
            }
            if(count > k){
                int copy = k;
                while( copy != 0 ){
                    ans[j] = val;
                    copy--;
                    j++;
                }
            }else{
                while(count != 0){
                    ans[j] = val;
                    count--;
                    j++;
                }
            }

        }
        return Arrays.copyOf(ans, j);
    }
}