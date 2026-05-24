package my.strings.practice;

public class Ex164 {

	public static boolean isPalindrome(String str) {

		// Remove spaces and symbols, keep only letters and digits
		String cleaned = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				cleaned += Character.toLowerCase(ch);
			}
		}

		int left = 0;
		int right = cleaned.length() - 1;

		while (left < right) {

			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";

		if (isPalindrome(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
