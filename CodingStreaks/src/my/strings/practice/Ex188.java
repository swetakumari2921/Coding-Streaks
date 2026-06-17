package my.strings.practice;

public class Ex188 {

	public static String rearrange(String str) {
		int n = str.length();

		int[] freq = new int[256];

		for (int i = 0; i < n; i++) {
			freq[str.charAt(i)]++;
		}

		char[] result = new char[n];

		for (int i = 0; i < n; i++) {
			result[i] = '#';
		}

		int maxFreq = 0;
		char maxChar = 0;

		for (int i = 0; i < 256; i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
				maxChar = (char) i;
			}
		}

		int index = 0;

		while (freq[maxChar] > 0) {
			result[index] = maxChar;
			index += 2;
			freq[maxChar]--;
		}

		for (int i = 0; i < 256; i++) {
			while (freq[i] > 0) {

				if (index >= n) {
					index = 1;
				}

				result[index] = (char) i;
				index += 2;
				freq[i]--;
			}
		}

		for (int i = 1; i < n; i++) {
			if (result[i] == result[i - 1]) {
				return "Not Possible";
			}
		}

		return new String(result);
	}

	public static void main(String[] args) {
		String str = "aaabbc";

		System.out.println(rearrange(str));
	}
}
