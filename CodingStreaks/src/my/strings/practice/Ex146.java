package my.strings.practice;

public class Ex146 {

	// check if two words are same
	public static boolean isEqual(String a, String b) {
		if (a.length() != b.length())
			return false;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	// check if word is in dictionary
	public static boolean isPresent(String[] dict, String word) {
		for (int i = 0; i < dict.length; i++) {
			if (isEqual(dict[i], word)) {
				return true;
			}
		}
		return false;
	}

	// simple similarity: one character mismatch allowed
	public static boolean isCloseMatch(String a, String b) {
		if (Math.abs(a.length() - b.length()) > 1)
			return false;

		int i = 0, j = 0, mismatch = 0;

		while (i < a.length() && j < b.length()) {
			if (a.charAt(i) != b.charAt(j)) {
				mismatch++;
				if (mismatch > 1)
					return false;

				// move longer string pointer
				if (a.length() > b.length())
					i++;
				else if (a.length() < b.length())
					j++;
				else {
					i++;
					j++;
				}
			} else {
				i++;
				j++;
			}
		}

		mismatch += (a.length() - i) + (b.length() - j);

		return mismatch <= 1;
	}

	public static void spellCheck(String[] dict, String word) {

		if (isPresent(dict, word)) {
			System.out.println(word + " is CORRECT");
			return;
		}

		System.out.println(word + " is WRONG. Suggestions:");

		boolean found = false;

		for (int i = 0; i < dict.length; i++) {
			if (isCloseMatch(dict[i], word)) {
				System.out.println(dict[i]);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No suggestions found");
		}
	}

	public static void main(String[] args) {

		String[] dict = { "apple", "banana", "orange", "grape", "mango" };

		String word = "aple";

		spellCheck(dict, word);
	}
}
