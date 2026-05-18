class Solution {
     public static StringBuilder operation(StringBuilder sb){
        int length = sb.length();
        for(int  i = 0 ; i < length ; i++){
            int idx = Math.abs(sb.charAt(i) - 'a');
            if(idx == 25){
                sb.append("a");
            }else{
                char letter = (char) ((idx + 1) + 'a');
                
                sb.append(letter);
                
            }

        }
        return sb;
    }
    public char kthCharacter(int k) {
       StringBuilder sb = new StringBuilder();
       sb.append("a");
        while(sb.length() < k){
            System.out.println(operation(sb));
        }
        return sb.charAt(k-1);
    }
}