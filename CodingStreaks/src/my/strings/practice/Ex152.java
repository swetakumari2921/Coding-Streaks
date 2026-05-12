package my.strings.practice;

public class Ex152 {

	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		String temp = s1 + s1;

		return isSubstring(temp, s2);
	}

	// manual substring check (no built-in contains)
	public static boolean isSubstring(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();

		for (int i = 0; i <= n - m; i++) {
			int j;

			for (j = 0; j < m; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}

			if (j == m) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";

		if (isRotation(s1, s2)) {
			System.out.println("Yes, rotation");
		} else {
			System.out.println("Not rotation");
		}
	}
}
