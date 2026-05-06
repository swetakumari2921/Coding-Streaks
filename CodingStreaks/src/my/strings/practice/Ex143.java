package my.strings.practice;

class TrieNode5 {
	TrieNode5[] children = new TrieNode5[26];
	boolean isEnd;
}

class Autocomplete {
	TrieNode5 root = new TrieNode5();

	void insert(String word) {
		TrieNode5 curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new TrieNode5();
			}
			curr = curr.children[idx];
		}
		curr.isEnd = true;
	}

	void dfs(TrieNode5 node, char[] buffer, int depth) {
		if (node.isEnd) {
			for (int i = 0; i < depth; i++) {
				System.out.print(buffer[i]);
			}
			System.out.println();
		}

		for (int i = 0; i < 26; i++) {
			if (node.children[i] != null) {
				buffer[depth] = (char) (i + 'a');
				dfs(node.children[i], buffer, depth + 1);
			}
		}
	}

	void search(String prefix) {
		TrieNode5 curr = root;

		for (int i = 0; i < prefix.length(); i++) {
			int idx = prefix.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				System.out.println("No suggestions");
				return;
			}
			curr = curr.children[idx];
		}

		char[] buffer = new char[100];

		for (int i = 0; i < prefix.length(); i++) {
			buffer[i] = prefix.charAt(i);
		}

		dfs(curr, buffer, prefix.length());
	}
}

public class Ex143 {
	public static void main(String[] args) {
		Autocomplete ac = new Autocomplete();

		ac.insert("apple");
		ac.insert("app");
		ac.insert("ape");
		ac.insert("bat");

		System.out.println("Suggestions for 'ap':");
		ac.search("ap");
	}
}
