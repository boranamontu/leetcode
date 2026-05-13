class Solution {
    public static class node{
        node childrens[] = new node[26];
        boolean eow = false;//end of the word
        node(){
            for(int i = 0 ; i < childrens.length ; i++){
                childrens[i] = null;
            }
        }
    }
    public static node root = new node();

    public static void insert(String word){//O(L)
        node curr = root;
        for(int level = 0;level<word.length() ;level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childrens[idx] == null){
                curr.childrens[idx] = new node();
            }
                curr = curr.childrens[idx];
            
        }
        curr.eow = true;
    }

     
    public static boolean search(String word){//O(L)
        node curr = root;
        for(int level = 0;level<word.length() ;level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childrens[idx] == null){
                return false;
            }
                curr = curr.childrens[idx];
            
        }
        return curr.eow;
    }
     public static boolean isPrefixAndSuffix(String str1,String str2){
       int size = Math.abs(str2.length()-str1.length());
        node curr = root;
        for(int i = 0;i<size ;i++){
            int idx = str2.charAt(i) - 'a';
            
                curr = curr.childrens[idx];
            
        }
        int i = 0;
        int j = size;
        boolean res = false;
        while(j != str2.length()){
            int idx = str2.charAt(j) - 'a';
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
                curr = curr.childrens[idx];
                res = true;
            }else{
                res = false;
                break;
            }
        }
        return res && curr.eow == true;

    }

    public int countPrefixSuffixPairs(String[] words) {
        for (String word : words) {
            insert(word);
        }
         int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
               boolean ans ;
                if(words[i].length() > words[j].length()  ){
                    System.out.println("greater");
                    ans = false; 
                }else
                if( !words[i].equals(words[j].substring(0,words[i].length()))){
                    
                    ans = false; 
                }else{
                  
                    ans =isPrefixAndSuffix(words[i], words[j]);
                }
               
               if(ans == true){
                count++;
                
               }
            }
        }
        return count;
    }
}