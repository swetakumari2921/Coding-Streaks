package my.strings.practice;

public class Ex105 {
	public static void main(String[] args) {
		String str = "aaabbcc";
		int k = 2;

		int maxLen = 0;

		for (int i = 0; i < str.length(); i++) {
			int[] freq = new int[26];

			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);
				freq[ch - 'a']++;

				if (valid(freq, k)) {
					int len = j - i + 1;
					if (len > maxLen) {
						maxLen = len;
					}
				}
			}
		}

		System.out.println(maxLen);
	}

	static boolean valid(int[] freq, int k) {
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0 && freq[i] < k) {
				return false;
			}
		}
		return true;
	}
}
