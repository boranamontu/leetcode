class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));
         int pairend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
           
            if(pairend<=intervals[i][0]){
                pairend=intervals[i][1];
            }else{
                count++;
            }
           
        }
     
        return count;
    }
}