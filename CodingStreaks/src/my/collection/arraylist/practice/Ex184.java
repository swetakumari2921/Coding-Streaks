package my.collection.arraylist.practice;

public class Ex184 {

	static boolean isScramble(String s1, String s2) {

		if (s1.equals(s2))
			return true;

		if (s1.length() != s2.length())
			return false;

		int n = s1.length();

		// Check character frequency
		int[] count = new int[256];

		for (int i = 0; i < n; i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] != 0)
				return false;
		}

		for (int i = 1; i < n; i++) {

			// Without swapping
			if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i)))
				return true;

			// With swapping
			if (isScramble(s1.substring(0, i), s2.substring(n - i))
					&& isScramble(s1.substring(i), s2.substring(0, n - i)))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String s1 = "great";
		String s2 = "rgeat";

		if (isScramble(s1, s2))
			System.out.println("Scrambled String");
		else
			System.out.println("Not a Scrambled String");
	}
}
