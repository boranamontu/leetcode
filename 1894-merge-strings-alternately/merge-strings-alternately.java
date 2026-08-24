class Solution {
    public String mergeAlternately(String word1, String word2) {
         int i = 0;
         int j = 0;
         String res = "";
         while(i < word1.length() && j < word2.length()){
            res += String.valueOf(word1.charAt(i));
            i++;
            res += String.valueOf(word2.charAt(j));
            j++;
         }
         if( i < word1.length()){
            res += word1.substring(i);
         }else{
            res += word2.substring(j);
         }
         return res;
    }
}