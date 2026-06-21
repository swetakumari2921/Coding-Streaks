package my.strings.practice;

public class Ex192 {

	static void printPalindromes(String str) {
		int n = str.length();

		for (int center = 0; center < n; center++) {

			// Odd length palindromes
			int left = center, right = center;
			while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
				System.out.println(str.substring(left, right + 1));
				left--;
				right++;
			}

			// Even length palindromes
			left = center;
			right = center + 1;
			while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
				System.out.println(str.substring(left, right + 1));
				left--;
				right++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "abba";
		printPalindromes(str);
	}
}
