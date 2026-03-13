package my.strings.practice;

public class Ex88 {

	static String[] buildSuffixArray(String s) {
		int n = s.length();
		String[] suffix = new String[n];

		for (int i = 0; i < n; i++)
			suffix[i] = s.substring(i);

		// simple sorting
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (suffix[i].compareTo(suffix[j]) > 0) {
					String temp = suffix[i];
					suffix[i] = suffix[j];
					suffix[j] = temp;
				}
			}
		}

		return suffix;
	}

	static int LCP(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (a.charAt(i) == b.charAt(i))
				count++;
			else
				break;
		}

		return count;
	}

	static int countDistinct(String s) {
		int n = s.length();

		String[] suffix = buildSuffixArray(s);

		int total = n * (n + 1) / 2;
		int lcpSum = 0;

		for (int i = 1; i < n; i++)
			lcpSum += LCP(suffix[i], suffix[i - 1]);

		return total - lcpSum;
	}

	public static void main(String[] args) {

		String s = "ababa";

		int result = countDistinct(s);
		System.out.println("Distinct substrings: " + result);
	}
}
