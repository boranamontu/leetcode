class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
    int n = matrix[0].length;
    int i = 0;
    while(i < m && target > matrix[i][n-1] ){
        
        i++;
    }

    if(i >= m){
        return false;
    }else{
    for(int j = 0;j < n;j++){
        if(matrix[i][j] == target){
            return true;
            
        }
    }
    return false;
    }
    }
}