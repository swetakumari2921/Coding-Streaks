package my.strings.practice;

public class Ex162 {
	public static void main(String[] args) {

		String paragraph = "java is easy and java is powerful";

		String[] words = new String[paragraph.length()];
		int[] freq = new int[paragraph.length()];
		int size = 0;

		String word = "";

		// manual word splitting
		for (int i = 0; i <= paragraph.length(); i++) {

			if (i < paragraph.length() && paragraph.charAt(i) != ' ') {
				word += paragraph.charAt(i);
			} else {

				if (word.length() > 0) {

					int index = -1;

					// check if word already exists
					for (int j = 0; j < size; j++) {
						if (words[j].equals(word)) {
							index = j;
							break;
						}
					}

					if (index != -1) {
						freq[index]++;
					} else {
						words[size] = word;
						freq[size] = 1;
						size++;
					}

					word = "";
				}
			}
		}

		// print result
		for (int i = 0; i < size; i++) {
			System.out.println(words[i] + " -> " + freq[i]);
		}
	}
}
