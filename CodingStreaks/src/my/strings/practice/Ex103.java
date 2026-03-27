package my.strings.practice;

public class Ex103 {
	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "cut";

		if (s1.length() != s2.length()) {
			System.out.println(false);
			return;
		}

		int diff = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				diff++;
			}
		}

		if (diff == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
