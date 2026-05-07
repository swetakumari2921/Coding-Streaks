package my.strings.practice;

public class Ex145 {

	public static double similarityScore(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		int maxLen;
		if (len1 > len2) {
			maxLen = len1;
		} else {
			maxLen = len2;
		}

		int minLen;
		if (len1 < len2) {
			minLen = len1;
		} else {
			minLen = len2;
		}

		int match = 0;

		for (int i = 0; i < minLen; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				match++;
			}
		}

		return (double) match * 100 / maxLen;
	}

	public static void main(String[] args) {

		String s1 = "programming";
		String s2 = "programming";

		double score = similarityScore(s1, s2);

		System.out.println(score);
	}
}
