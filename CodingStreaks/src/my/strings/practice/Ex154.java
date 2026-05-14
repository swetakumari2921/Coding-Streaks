package my.strings.practice;

public class Ex154 {

	public static char firstNonRepeating(String str) {

		int[] count = new int[256];

		// Count frequency of characters
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		// Find first non-repeating character
		for (int i = 0; i < str.length(); i++) {

			if (count[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}

		return '\0';
	}

	public static void main(String[] args) {

		String str = "swiss";

		char result = firstNonRepeating(str);

		if (result != '\0') {
			System.out.println("First Non-Repeating Character: " + result);
		} else {
			System.out.println("No Non-Repeating Character Found");
		}
	}
}
