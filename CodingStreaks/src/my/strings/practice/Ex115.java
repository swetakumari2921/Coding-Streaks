package my.strings.practice;

public class Ex115 {
	public static void main(String[] args) {
		String s = "aabacbebebe";
		int k = 3;

		int[] freq = new int[256];
		int left = 0, count = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			if (freq[s.charAt(right)] == 0)
				count++;
			freq[s.charAt(right)]++;

			while (count > k) {
				freq[s.charAt(left)]--;
				if (freq[s.charAt(left)] == 0)
					count--;
				left++;
			}

			if (count == k)
				maxLen = Math.max(maxLen, right - left + 1);
		}

		System.out.println(maxLen);
	}
}
