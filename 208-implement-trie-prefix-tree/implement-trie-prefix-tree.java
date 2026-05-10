class Trie {
    public static class node{
        node childrens[] = new node[26];
        boolean eow = false;
        node(){
            for(int i = 0 ; i < childrens.length ; i++){
                childrens[i] = null;
            }
        }
    }
    public static node root;
    public Trie() {
        root = new node();
    }
    
    public void insert(String word) {
        node curr = root;
        for(int level = 0 ; level < word.length() ; level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childrens[idx] == null){
                curr.childrens[idx] = new node();
            }
            curr = curr.childrens[idx];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        node curr = root;
        for(int level = 0 ; level < word.length() ; level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childrens[idx] == null){
                return false;
            }
            curr = curr.childrens[idx];
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        node curr = root;
        for(int level = 0 ; level < prefix.length() ; level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.childrens[idx] == null){
                return false;
            }
            curr = curr.childrens[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */