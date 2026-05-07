package my.strings.practice;

public class Ex144 {

	// Calculate similarity percentage
	public static double similarity(String s1, String s2) {

		int maxLength;

		if (s1.length() > s2.length()) {
			maxLength = s1.length();
		} else {
			maxLength = s2.length();
		}

		int same = 0;

		int minLength;

		if (s1.length() < s2.length()) {
			minLength = s1.length();
		} else {
			minLength = s2.length();
		}

		// Count same characters at same position
		for (int i = 0; i < minLength; i++) {

			if (s1.charAt(i) == s2.charAt(i)) {
				same++;
			}
		}

		return ((double) same / maxLength) * 100;
	}

	public static void main(String[] args) {

		String text1 = "Java Programming";
		String text2 = "Java Programminx";

		double result = similarity(text1, text2);

		System.out.println("Similarity = " + result + "%");

		if (result >= 80) {
			System.out.println("Possible Plagiarism Detected");
		} else {
			System.out.println("No Significant Plagiarism");
		}
	}
}
