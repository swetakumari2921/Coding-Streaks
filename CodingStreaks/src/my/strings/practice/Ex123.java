package my.strings.practice;

public class Ex123 {
	public static void main(String[] args) {
		String text = "forxxorfxdofr";
		String pattern = "for";

		int result = countAnagrams(text, pattern);
		System.out.println(result);
	}

	static int countAnagrams(String text, String pattern) {
		int count = 0;
		int k = pattern.length();

		int[] pFreq = new int[26];
		int[] windowFreq = new int[26];

		// pattern frequency
		for (int i = 0; i < k; i++) {
			pFreq[pattern.charAt(i) - 'a']++;
			windowFreq[text.charAt(i) - 'a']++;
		}

		// check first window
		if (isEqual(pFreq, windowFreq))
			count++;

		// sliding window
		for (int i = k; i < text.length(); i++) {
			windowFreq[text.charAt(i) - 'a']++; // add new char
			windowFreq[text.charAt(i - k) - 'a']--; // remove old char

			if (isEqual(pFreq, windowFreq))
				count++;
		}

		return count;
	}

	static boolean isEqual(int[] a, int[] b) {
		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}
