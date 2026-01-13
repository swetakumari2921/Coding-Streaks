package my.strings.practice;

// Find longest word in a sentence

public class Ex28 {
	public static void main(String[] args) {
		String sentence = "Find the longest word in a sentence";

		String[] words = sentence.split(" ");
		String longestWord = "";
		int maxLength = 0;

		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}

		System.out.println("Longest word: " + longestWord);
		System.out.println("Length: " + maxLength);
	}
}
