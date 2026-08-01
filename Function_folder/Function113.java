import java.util.Scanner;

public class Function113 {

    static class TrieNode {

        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }

    static class Trie {

        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

        // Insert a word
        public void insert(String word) {

            TrieNode current = root;

            for (int i = 0; i < word.length(); i++) {

                int index = word.charAt(i) - 'a';

                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }

                current = current.children[index];
            }

            current.isEndOfWord = true;
        }

        // Search a complete word
        public boolean search(String word) {

            TrieNode current = root;

            for (int i = 0; i < word.length(); i++) {

                int index = word.charAt(i) - 'a';

                if (current.children[index] == null) {
                    return false;
                }

                current = current.children[index];
            }

            return current.isEndOfWord;
        }

        // Check prefix
        public boolean startsWith(String prefix) {

            TrieNode current = root;

            for (int i = 0; i < prefix.length(); i++) {

                int index = prefix.charAt(i) - 'a';

                if (current.children[index] == null) {
                    return false;
                }

                current = current.children[index];
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println("Search apple: " + trie.search("apple"));
        System.out.println("Search app: " + trie.search("app"));
        System.out.println("Search bat: " + trie.search("bat"));
        System.out.println("Search cat: " + trie.search("cat"));

        System.out.println();

        System.out.println("StartsWith ap: " + trie.startsWith("ap"));
        System.out.println("StartsWith ba: " + trie.startsWith("ba"));
        System.out.println("StartsWith ca: " + trie.startsWith("ca"));
    }
}