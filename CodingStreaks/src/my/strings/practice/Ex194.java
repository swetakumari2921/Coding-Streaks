package my.strings.practice;

public class Ex194 {

	public static boolean isMatch(String s, String p) {
		return match(s, p, 0, 0);
	}

	private static boolean match(String s, String p, int i, int j) {

		if (j == p.length()) {
			return i == s.length();
		}

		boolean firstMatch = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

		if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
			return match(s, p, i, j + 2) || (firstMatch && match(s, p, i + 1, j));
		}

		return firstMatch && match(s, p, i + 1, j + 1);
	}

	public static void main(String[] args) {
		String s = "aab";
		String p = "c*a*b";

		System.out.println(isMatch(s, p));
	}
}
