package my.strings.practice;

public class Ex161 {

	// Function for basic pattern matching
	public static void patternMatch(String text, String pattern) {

		int textLength = text.length();
		int patternLength = pattern.length();

		boolean found = false;

		// Traverse the text
		for (int i = 0; i <= textLength - patternLength; i++) {

			int j;

			// Compare pattern with text characters
			for (j = 0; j < patternLength; j++) {

				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}

			// If complete pattern matched
			if (j == patternLength) {
				System.out.println("Pattern found at index: " + i);
				found = true;
			}
		}

		if (!found) {
			System.out.println("Pattern not found");
		}
	}

	public static void main(String[] args) {

		String text = "helloworld";
		String pattern = "world";

		patternMatch(text, pattern);
	}
}
