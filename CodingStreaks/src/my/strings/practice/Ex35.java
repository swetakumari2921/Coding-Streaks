package my.strings.practice;

// Find index of first vowel

public class Ex35 {
	public static void main(String[] args) {
		String str = "sweta";
		str = str.toLowerCase();

		char[] arr = str.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (arr[i] == vowels[j]) {
					System.out.println("First vowel index: " + i);
					return;
				}
			}
		}

		System.out.println("No vowel found");
	}
}
