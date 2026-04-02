package my.strings.practice;

public class Ex109 {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "abzdf";
		int k = 2;

		if (s1.length() != s2.length()) {
			System.out.println("Not Possible");
			return;
		}

		int diff = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				diff++;
			}
		}

		if (diff <= k) {
			System.out.println("Possible");
		} else {
			System.out.println("Not Possible");
		}
	}
}
