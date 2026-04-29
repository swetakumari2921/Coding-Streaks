package my.strings.practice;

class TrieNode {
	TrieNode[] children;
	boolean isEnd;

	TrieNode() {
		children = new TrieNode[26];
		isEnd = false;
	}
}

public class Ex136 {
	TrieNode root;

	Ex136() {
		root = new TrieNode();
	}

	void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
		}
		current.isEnd = true;
	}

	boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (current.children[index] == null) {
				return false;
			}
			current = current.children[index];
		}
		return current.isEnd;
	}

	boolean startsWith(String prefix) {
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

	public static void main(String[] args) {
		Ex136 trie = new Ex136();

		trie.insert("apple");
		System.out.println(trie.search("apple"));
		System.out.println(trie.search("app"));
		System.out.println(trie.startsWith("app"));

		trie.insert("app");
		System.out.println(trie.search("app"));
	}
}
