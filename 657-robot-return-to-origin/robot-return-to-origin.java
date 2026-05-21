class Solution {
    public boolean judgeCircle(String moves) {
         int i = 0;
         int j = 0;
    for(int c = 0 ; c < moves.length(); c++){
        if("R".equals(String.valueOf(moves.charAt(c)))){
            j = j + 1;
        } if("L".equals(String.valueOf(moves.charAt(c)))){
            
            j = j - 1;
        }if("U".equals(String.valueOf(moves.charAt(c)))){
            i = i - 1;
        } if("D".equals(String.valueOf(moves.charAt(c))) ){
            i = i + 1;
        }
    }
    return i == 0 && j == 0;
    }
}