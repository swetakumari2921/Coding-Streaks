package my.strings.practice;

public class Ex163 {

	public static void main(String[] args) {

		String sentence = "java is easy and java is powerful";

		String[] words = sentence.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {

			boolean isDuplicate = false;

			// Check if word already appeared before
			for (int j = 0; j < i; j++) {
				if (words[i].equals(words[j])) {
					isDuplicate = true;
					break;
				}
			}

			// Add unique word to result
			if (!isDuplicate) {
				result = result + words[i] + " ";
			}
		}

		System.out.println("Sentence after removing duplicates:");
		System.out.println(result.trim());
	}
}
