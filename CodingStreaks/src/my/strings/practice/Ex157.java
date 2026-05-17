package my.strings.practice;

public class Ex157 {

	// Function to generate permutations
	public static void permute(String str, int left, int right) {

		if (left == right) {
			System.out.println(str);
			return;
		}

		for (int i = left; i <= right; i++) {

			// Swap characters
			str = swap(str, left, i);

			// Recursive call
			permute(str, left + 1, right);

			// Backtrack
			str = swap(str, left, i);
		}
	}

	// Function to swap characters
	public static String swap(String str, int i, int j) {

		char[] ch = str.toCharArray();

		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		return new String(ch);
	}

	public static void main(String[] args) {

		String str = "ABC";

		System.out.println("Permutations are:");
		permute(str, 0, str.length() - 1);
	}
}
