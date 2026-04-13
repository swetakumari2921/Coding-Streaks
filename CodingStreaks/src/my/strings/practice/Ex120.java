package my.strings.practice;

public class Ex120 {
	public static void main(String[] args) {
		String str = "aeiobcdfaeiou";
		int n = str.length();

		int[] vowel = new int[5];
		int left = 0, maxLen = 0;

		for (int right = 0; right < n; right++) {
			char ch = str.charAt(right);

			int idx = getIndex(ch);
			if (idx != -1) {
				vowel[idx]++;

				while (vowel[idx] > 1) {
					char leftChar = str.charAt(left);
					int leftIdx = getIndex(leftChar);
					if (leftIdx != -1) {
						vowel[leftIdx]--;
					}
					left++;
				}
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		System.out.println(maxLen);
	}

	static int getIndex(char ch) {
		if (ch == 'a')
			return 0;
		if (ch == 'e')
			return 1;
		if (ch == 'i')
			return 2;
		if (ch == 'o')
			return 3;
		if (ch == 'u')
			return 4;
		return -1;
	}
}
