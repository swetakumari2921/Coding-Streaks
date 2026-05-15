package my.strings.practice;

public class Ex155 {
	static String minWindow(String s, String t) {
		if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
			return "";
		}

		int[] need = new int[256];
		int[] window = new int[256];

		for (int i = 0; i < t.length(); i++) {
			need[t.charAt(i)]++;
		}

		int required = t.length();
		int formed = 0;

		int left = 0;
		int minLen = Integer.MAX_VALUE;
		int start = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			window[ch]++;

			if (need[ch] > 0 && window[ch] <= need[ch]) {
				formed++;
			}

			while (formed == required) {
				int currentLen = right - left + 1;

				if (currentLen < minLen) {
					minLen = currentLen;
					start = left;
				}

				char leftChar = s.charAt(left);
				window[leftChar]--;

				if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
					formed--;
				}

				left++;
			}
		}

		if (minLen == Integer.MAX_VALUE) {
			return "";
		}

		return s.substring(start, start + minLen);
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println(minWindow(s, t)); // BANC
	}
}
