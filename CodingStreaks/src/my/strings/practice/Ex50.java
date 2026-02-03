package my.strings.practice;

public class Ex50 {

	public static String minWindow(String s, String t) {

		if (s.length() < t.length()) {
			return "";
		}

		int[] freqT = new int[256];
		int[] freqWindow = new int[256];

		for (int i = 0; i < t.length(); i++) {
			freqT[t.charAt(i)]++;
		}

		int left = 0, right = 0;
		int matched = 0;
		int minLen = Integer.MAX_VALUE;
		int startIndex = 0;

		while (right < s.length()) {

			char ch = s.charAt(right);
			freqWindow[ch]++;

			if (freqWindow[ch] <= freqT[ch]) {
				matched++;
			}

			while (matched == t.length()) {

				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					startIndex = left;
				}

				char leftChar = s.charAt(left);
				freqWindow[leftChar]--;

				if (freqWindow[leftChar] < freqT[leftChar]) {
					matched--;
				}

				left++;
			}

			right++;
		}

		return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println(minWindow(s, t));
	}
}
