package my.strings.practice;

class TrieNode2 {
	TrieNode2[] children = new TrieNode2[26];
	boolean isEnd;
}

public class Ex138 {

	static TrieNode2 root = new TrieNode2();

	static void insert(String word) {
		TrieNode2 node = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (node.children[idx] == null) {
				node.children[idx] = new TrieNode2();
			}
			node = node.children[idx];
		}
		node.isEnd = true;
	}

	static TrieNode2 searchPrefix(String prefix) {
		TrieNode2 node = root;
		for (int i = 0; i < prefix.length(); i++) {
			int idx = prefix.charAt(i) - 'a';
			if (node.children[idx] == null)
				return null;
			node = node.children[idx];
		}
		return node;
	}

	static void dfs(TrieNode2 node, char[] path, int depth) {
		if (node.isEnd) {
			for (int i = 0; i < depth; i++) {
				System.out.print(path[i]);
			}
			System.out.println();
		}

		for (int i = 0; i < 26; i++) {
			if (node.children[i] != null) {
				path[depth] = (char) (i + 'a');
				dfs(node.children[i], path, depth + 1);
			}
		}
	}

	static void autocomplete(String prefix) {
		TrieNode2 node = searchPrefix(prefix);
		if (node == null)
			return;

		char[] path = new char[100];
		for (int i = 0; i < prefix.length(); i++) {
			path[i] = prefix.charAt(i);
		}

		dfs(node, path, prefix.length());
	}

	public static void main(String[] args) {
		insert("apple");
		insert("app");
		insert("april");
		insert("bat");
		insert("ball");

		autocomplete("ap");
	}
}
