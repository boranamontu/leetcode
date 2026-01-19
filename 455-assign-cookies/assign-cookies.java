class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=s.length-1;
        int max=0;
        if(s.length==0 || g.length==0){
            return 0;
        }
        for(int i=g.length-1;i>=0;i--){
            if(j==-1){
                return max;
            }
            if(s[j]>=g[i]){
                max++;
                j--;
            }
        }
       return max;
    }
}