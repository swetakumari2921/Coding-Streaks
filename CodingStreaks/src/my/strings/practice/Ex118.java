package my.strings.practice;

public class Ex118 {
	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;

		int[] freq = new int[26];
		int left = 0, maxCount = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			freq[s.charAt(right) - 'A']++;

			if (freq[s.charAt(right) - 'A'] > maxCount) {
				maxCount = freq[s.charAt(right) - 'A'];
			}

			while ((right - left + 1) - maxCount > k) {
				freq[s.charAt(left) - 'A']--;
				left++;
			}

			int windowLen = right - left + 1;
			if (windowLen > maxLen) {
				maxLen = windowLen;
			}
		}

		System.out.println(maxLen);
	}
}
