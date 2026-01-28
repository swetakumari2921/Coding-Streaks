package my.strings.practice;

// Find longest repeating character sequence

public class Ex44 {
	public static void findLongestRepeatingSequence(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("Empty string.");
			return;
		}

		int maxCount = 1;
		int currCount = 1;
		char maxChar = s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				currCount++;
			} else {
				currCount = 1;
			}

			if (currCount > maxCount) {
				maxCount = currCount;
				maxChar = s.charAt(i);
			}
		}

		System.out.println("Longest repeating character: '" + maxChar + "' with length = " + maxCount);
	}

	public static void main(String[] args) {
		String s = "aaabbcaaaa";
		findLongestRepeatingSequence(s);
	}
}
