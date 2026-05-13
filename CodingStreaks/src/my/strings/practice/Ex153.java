package my.strings.practice;

public class Ex153 {

	// Function to check if two strings are anagrams
	public static boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		// Sort both character arrays
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					char temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}

		// Compare sorted arrays
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}

	public static void groupAnagrams(String[] arr) {

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (visited[i]) {
				continue;
			}

			System.out.print("Group: ");

			System.out.print(arr[i] + " ");
			visited[i] = true;

			for (int j = i + 1; j < arr.length; j++) {

				if (!visited[j] && isAnagram(arr[i], arr[j])) {
					System.out.print(arr[j] + " ");
					visited[j] = true;
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		String[] arr = { "cat", "dog", "tac", "god", "act", "rat" };

		groupAnagrams(arr);
	}
}
