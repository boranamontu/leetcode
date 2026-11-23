class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int idx = 0;
        for(int i = 0 ; i < nums1.length;i++){
            arr[i] = nums1[i];
            idx++;
        } 
        for(int i = 0 ; i < nums2.length;i++){
            arr[idx] = nums2[i];
            idx++;
        } 
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            int median = (arr[arr.length/2]+arr[(arr.length/2)-1]);
            System.out.println(arr[(arr.length/2)-1]);
            System.out.println(arr[(arr.length/2)]);
            return (double)median/2;
        }
        double median = (arr[arr.length/2]);
        return median;
        
    }
}