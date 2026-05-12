package my.strings.practice;

public class Ex149 {

	// Function to find longest palindrome
	public static String longestPalindrome(String str) {

		if (str == null || str.length() == 0) {
			return "";
		}

		int start = 0;
		int maxLength = 1;

		for (int i = 0; i < str.length(); i++) {

			// Odd length palindrome
			int left = i;
			int right = i;

			while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

				int length = right - left + 1;

				if (length > maxLength) {
					start = left;
					maxLength = length;
				}

				left--;
				right++;
			}

			// Even length palindrome
			left = i;
			right = i + 1;

			while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

				int length = right - left + 1;

				if (length > maxLength) {
					start = left;
					maxLength = length;
				}

				left--;
				right++;
			}
		}

		return str.substring(start, start + maxLength);
	}

	public static void main(String[] args) {

		String str = "babad";

		String result = longestPalindrome(str);

		System.out.println("Longest Palindromic Substring: " + result);
	}
}
