package my.strings.practice;

public class Ex141 {
	static boolean canForm(String word, int[] freq) {
		int[] temp = new int[26];

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			temp[ch - 'a']++;

			if (temp[ch - 'a'] > freq[ch - 'a']) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";

		int[] freq = new int[26];

		for (int i = 0; i < chars.length(); i++) {
			freq[chars.charAt(i) - 'a']++;
		}

		for (int i = 0; i < words.length; i++) {
			if (canForm(words[i], freq)) {
				System.out.println(words[i]);
			}
		}
	}
}
