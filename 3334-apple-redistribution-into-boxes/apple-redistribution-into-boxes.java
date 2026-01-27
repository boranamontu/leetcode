class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totapp=0;
        for(int i=0;i<apple.length;i++){
            totapp=totapp+apple[i];
        }
        Arrays.sort(capacity);
        int selecap=0;
        int j=capacity.length-1;
        int count=0;
        while(selecap<totapp && j!=-1){
            selecap=selecap+capacity[j];
            count++;
            j--;
        }
        return count;
    }
}