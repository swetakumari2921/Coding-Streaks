package my.strings.practice;

public class Ex116 {
	public static void main(String[] args) {
		String s = "abcde";
		int[] weight = new int[26];

		weight['a' - 'a'] = 1;
		weight['b' - 'a'] = 2;
		weight['c' - 'a'] = 3;
		weight['d' - 'a'] = 4;
		weight['e' - 'a'] = 5;

		int target = 7;

		int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

		for (int right = 0; right < s.length(); right++) {
			sum += weight[s.charAt(right) - 'a'];

			while (sum >= target) {
				minLen = Math.min(minLen, right - left + 1);
				sum -= weight[s.charAt(left) - 'a'];
				left++;
			}
		}

		if (minLen == Integer.MAX_VALUE)
			System.out.println("No substring found");
		else
			System.out.println("Minimum length: " + minLen);
	}
}
