package my.strings.practice;

public class Ex182 {

	public static boolean sameCharacterSet(String s1, String s2) {
		boolean[] set1 = new boolean[256];
		boolean[] set2 = new boolean[256];

		for (int i = 0; i < s1.length(); i++) {
			set1[s1.charAt(i)] = true;
		}

		for (int i = 0; i < s2.length(); i++) {
			set2[s2.charAt(i)] = true;
		}

		for (int i = 0; i < 256; i++) {
			if (set1[i] != set2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "aabbcc";
		String s2 = "cbac";

		if (sameCharacterSet(s1, s2)) {
			System.out.println("Same set of characters");
		} else {
			System.out.println("Different set of characters");
		}
	}
}
