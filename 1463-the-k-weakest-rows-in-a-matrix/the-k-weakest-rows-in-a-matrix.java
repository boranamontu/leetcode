class Solution {
    static class sort implements Comparable<sort>{
        int idx;
        int sum;

        public sort(int idx,int sum){
            this.idx = idx;
            this.sum = sum;
        }

        @Override
        public int compareTo(sort curr){
            if(this.sum == curr.sum){
                return this.idx - curr.idx;
            }
            return this.sum - curr.sum;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<sort> pq = new PriorityQueue<>();
        int ans[] = new int[k];

        for(int i = 0 ; i < mat.length ; i++){
            int sum = 0;

            for(int j = 0 ; j < mat[0].length ; j++){
                sum = sum + mat[i][j];
            }

            pq.add(new sort(i,sum));
        }

        int j=0;
        while(k!=0){
            ans[j] = pq.peek().idx;
            pq.remove();
            j++;
            k--;
        }
        return ans;
    }
}