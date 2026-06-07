class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int map[] = new int[(m*n)+1];
        int ans[] = new int[2];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                map[grid[i][j]]++;
                if(map[grid[i][j]] >= 2){
                    ans[0] = grid[i][j];
                }
            }
        }
        int i = 1;
        while(i != map.length){
            if(map[i] == 0){
                ans[1] = i;
                break;
            }
            i++;
        }
        return ans;
    }
}