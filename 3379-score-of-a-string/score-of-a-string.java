class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for(int i = 1 ; i < s.length() ; i++){
            sum = sum + (Math.abs(Integer.valueOf(s.charAt(i - 1)) - Integer.valueOf(s.charAt(i))));
        }
        return sum;
    }
}