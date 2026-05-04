class Solution {
    static public  class sort implements Comparable<sort>{
        int u;
        int v;
        int pnt;
        public sort(int u,int v,int pnt){
            this.u = u;
            this.v = v;
            this.pnt = pnt;
        }
        @Override
        public  int compareTo(sort curr){
            return this.pnt - curr.pnt;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<sort> pq = new PriorityQueue<>();
        for(int i = 0 ;i < points.length ; i++){
            pq.add(new sort(points[i][0],points[i][1],points[i][0]*points[i][0]+points[i][1]*points[i][1]));
        }
        int ans[][] = new int[k][2];
        int j = 0;
        while(k != 0){
            ans[j][0] = pq.peek().u;
            ans[j][1] = pq.peek().v;
            pq.remove();
            k--;
            j++;
         }
         return ans;
    }
}