package my.strings.practice;

public class Ex189 {

	public static boolean isSubsequence(String s, String word) {
		int i = 0, j = 0;

		while (i < s.length() && j < word.length()) {
			if (s.charAt(i) == word.charAt(j)) {
				j++;
			}
			i++;
		}

		return j == word.length();
	}

	public static String longestWord(String s, String[] dict) {
		String result = "";

		for (int i = 0; i < dict.length; i++) {
			String word = dict[i];

			if (isSubsequence(s, word)) {
				if (word.length() > result.length()) {
					result = word;
				} else if (word.length() == result.length() && word.compareTo(result) < 0) {
					result = word;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String s = "abpcplea";
		String[] dict = { "ale", "apple", "monkey", "plea" };

		System.out.println("Longest Word: " + longestWord(s, dict));
	}
}
