package my.strings.practice;

public class Ex47 {
	public static int countPalindromes(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count += expandFromCenter(s, i, i);

			count += expandFromCenter(s, i, i + 1);
		}

		return count;
	}

	private static int expandFromCenter(String s, int left, int right) {
		int count = 0;

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "aaa";
		System.out.println(countPalindromes(s));
	}
}
