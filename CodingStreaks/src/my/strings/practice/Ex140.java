package my.strings.practice;

class TrieNode4 {
	TrieNode4[] child = new TrieNode4[26];
	boolean isEnd;
}

public class Ex140 {

	static TrieNode4 root = new TrieNode4();

	static void insert(String word) {
		TrieNode4 curr = root;

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			if (curr.child[idx] == null)
				curr.child[idx] = new TrieNode4();

			curr = curr.child[idx];
		}

		curr.isEnd = true;
	}

	static boolean checkAllPrefixes(String word) {
		TrieNode4 curr = root;

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			curr = curr.child[idx];

			if (curr == null || curr.isEnd == false)
				return false;
		}

		return true;
	}

	static String longestWord(String[] words) {

		for (int i = 0; i < words.length; i++)
			insert(words[i]);

		String ans = "";

		for (int i = 0; i < words.length; i++) {

			if (checkAllPrefixes(words[i])) {

				if (words[i].length() > ans.length()
						|| (words[i].length() == ans.length() && words[i].compareTo(ans) < 0)) {
					ans = words[i];
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		String[] words = { "a", "ap", "app", "appl", "apple", "apply" };

		System.out.println(longestWord(words));
	}
}
