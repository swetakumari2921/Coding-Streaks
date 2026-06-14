package my.strings.practice;

public class Ex185 {

	public static void findAnagrams(String s, String p) {
		int n = s.length();
		int m = p.length();

		if (n < m)
			return;

		int[] pFreq = new int[256];
		int[] sFreq = new int[256];

		// frequency of pattern
		for (int i = 0; i < m; i++) {
			pFreq[p.charAt(i)]++;
			sFreq[s.charAt(i)]++;
		}

		for (int i = m; i < n; i++) {

			if (isEqual(pFreq, sFreq)) {
				System.out.print((i - m) + " ");
			}

			// slide window
			sFreq[s.charAt(i)]++;
			sFreq[s.charAt(i - m)]--;
		}

		// check last window
		if (isEqual(pFreq, sFreq)) {
			System.out.print((n - m) + " ");
		}
	}

	private static boolean isEqual(int[] a, int[] b) {
		for (int i = 0; i < 256; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";

		System.out.print("Starting indices of anagrams: ");
		findAnagrams(s, p);
	}
}
