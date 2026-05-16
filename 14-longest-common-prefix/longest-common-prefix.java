class Solution {
    // 1. Define a clean Trie Node class
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int freq = 0;
    }

    // 2. Clear insert function using local root tracking
    private void insert(TrieNode root, String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
            curr.freq++; // Track how many words pass through this node
        }
    }

    public String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) return "";
        if (words.length == 1) return words[0];

        TrieNode root = new TrieNode();
        
        // 3. Insert all words into the Trie
        for (String word : words) {
            if (word.isEmpty()) return ""; // Empty string means no common prefix
            insert(root, word);
        }

        StringBuilder ans = new StringBuilder();
        TrieNode curr = root;
        String firstWord = words[0];

        // 4. Trace the first word to find the common path
        for (int i = 0; i < firstWord.length(); i++) {
            int idx = firstWord.charAt(i) - 'a';
            TrieNode nextNode = curr.children[idx];

            // If ALL words share this character, its frequency must equal array length
            if (nextNode != null && nextNode.freq == words.length) {
                ans.append(firstWord.charAt(i));
                curr = nextNode;
            } else {
                break; // Prefix diverges or ends here
            }
        }

        return ans.toString();
    }
}
