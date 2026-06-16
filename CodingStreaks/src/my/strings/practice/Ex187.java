package my.strings.practice;

public class Ex187 {

	public static String shortestPalindrome(String s) {

		int n = s.length();

		for (int i = n; i >= 0; i--) {

			if (isPalindrome(s, 0, i - 1)) {

				String suffix = s.substring(i);
				StringBuilder result = new StringBuilder();

				for (int j = suffix.length() - 1; j >= 0; j--) {
					result.append(suffix.charAt(j));
				}

				result.append(s);
				return result.toString();
			}
		}

		return s;
	}

	public static boolean isPalindrome(String s, int left, int right) {

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "aacecaaa";

		System.out.println("Shortest Palindrome: " + shortestPalindrome(str));
	}
}
