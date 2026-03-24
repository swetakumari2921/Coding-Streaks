package my.strings.practice;

public class Ex100 {
	public static void main(String[] args) {
		String s = "pqpqs";
		int k = 2;

		int result = countExactlyK(s, k);
		System.out.println(result); // Output: 7
	}

	public static int countExactlyK(String s, int k) {
		return atMostK(s, k) - atMostK(s, k - 1);
	}

	public static int atMostK(String s, int k) {
		int[] freq = new int[256]; // ASCII
		int left = 0, count = 0, distinct = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			if (freq[ch] == 0)
				distinct++;
			freq[ch]++;

			while (distinct > k) {
				char leftChar = s.charAt(left);
				freq[leftChar]--;

				if (freq[leftChar] == 0)
					distinct--;
				left++;
			}

			count += (right - left + 1);
		}

		return count;
	}
}
