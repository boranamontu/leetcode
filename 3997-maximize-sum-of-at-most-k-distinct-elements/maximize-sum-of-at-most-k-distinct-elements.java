class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int count=k;
        int last=0;
        Arrays.sort(nums);
         ArrayList<Integer> ll=new ArrayList<>();
      
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
                 if(last!=nums[i] && count!=0){
                       ll.add(nums[i]);
                       last=nums[i];
                       count--;
                       j++;
                 }
        }
          int ans[]=new int[ll.size()];
          for(int m=0;m<ans.length;m++){
            ans[m]=ll.get(m);
          }
        return ans;
    }
}