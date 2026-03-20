package my.strings.practice;

public class Ex95 {
	public static void main(String[] args) {
		String str = "abba";
		int n = str.length();

		for (int i = 0; i < n; i++) {
			expand(str, i, i); // odd length
			expand(str, i, i + 1); // even length
		}
	}

	public static void expand(String str, int left, int right) {
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			System.out.println(str.substring(left, right + 1));
			left--;
			right++;
		}
	}
}
