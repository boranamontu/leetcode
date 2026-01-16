class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[nums1.length];
        int i=0;int j=0;
        int k=0;
        if(m==0 && n==1){
            nums1[0]=nums2[0];
            return;
        }
        if(nums1.length==1 && nums2.length==1){
            return;
        }
        while(i!=m && j!=n){
            if(nums1[i]<=nums2[j]){
                 ans[k]=nums1[i];
                 k++;
                 i++;
            }else if(nums1[i]>nums2[j]){
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(i!=m){
            while(i!=m){
                ans[k]=nums1[i];
                i++;
                k++;
            }
        }else if(j!=n){
            while(j!=n){
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        for(i=0;i<nums1.length;i++){
            nums1[i]=ans[i];
        }
    }
}