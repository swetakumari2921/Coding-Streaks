package my.strings.practice;

class TrieNode3 {
	TrieNode3[] child = new TrieNode3[26];
	boolean isEnd;
}

public class Ex139 {

	static TrieNode3 root = new TrieNode3();

	// insert word into trie
	static void insert(String word) {
		TrieNode3 curr = root;

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			if (curr.child[idx] == null) {
				curr.child[idx] = new TrieNode3();
			}
			curr = curr.child[idx];
		}
		curr.isEnd = true;
	}

	// find shortest root
	static String findRoot(String word) {
		TrieNode3 curr = root;
		String result = "";

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			if (curr.child[idx] == null) {
				return word;
			}

			result += word.charAt(i);
			curr = curr.child[idx];

			if (curr.isEnd) {
				return result;
			}
		}
		return word;
	}

	public static void main(String[] args) {

		String dict[] = { "cat", "bat", "rat" };
		String sentence = "cattle battle rattled";

		// insert dictionary words
		for (int i = 0; i < dict.length; i++) {
			insert(dict[i]);
		}

		String words[] = sentence.split(" ");
		String output = "";

		for (int i = 0; i < words.length; i++) {
			output += findRoot(words[i]);

			if (i != words.length - 1) {
				output += " ";
			}
		}

		System.out.println(output);
	}
}
