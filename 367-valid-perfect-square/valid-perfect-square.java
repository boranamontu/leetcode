class Solution {
    public boolean isPerfectSquare(int num) {
        int square=(int)Math.sqrt(num);
        if(num!=square*square){
            return false;
        }
        return true;
    }
}