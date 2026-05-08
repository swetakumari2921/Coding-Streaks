package my.strings.practice;

public class Ex147 {

	public static void main(String[] args) {

		String paragraph = "java is easy java is powerful and java is popular";

		// Convert into lowercase
		paragraph = paragraph.toLowerCase();

		// Split words
		String[] words = paragraph.split(" ");

		// Array to store unique words
		String[] unique = new String[words.length];
		int[] count = new int[words.length];

		int size = 0;

		// Count frequency manually
		for (int i = 0; i < words.length; i++) {

			boolean found = false;

			for (int j = 0; j < size; j++) {

				if (words[i].equals(unique[j])) {
					count[j]++;
					found = true;
					break;
				}
			}

			if (!found) {
				unique[size] = words[i];
				count[size] = 1;
				size++;
			}
		}

		// Find most frequent word
		int max = count[0];
		String mostFrequent = unique[0];

		for (int i = 1; i < size; i++) {

			if (count[i] > max) {
				max = count[i];
				mostFrequent = unique[i];
			}
		}

		System.out.println("Most frequent word: " + mostFrequent);
		System.out.println("Frequency: " + max);
	}
}
