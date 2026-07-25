class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int mini = Integer.MAX_VALUE;
        char val = ' ';
        for (int i = 0; i < letters.length; i++) {
            if ((int) target < letters[i]) {
                mini = Math.min(mini, (int) (letters[i] - target));
                val = letters[i];
            }

        }
        if(val == ' '){
            return letters[0];
        }
        return (char) (mini + target);
    }
}