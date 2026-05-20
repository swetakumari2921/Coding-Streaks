package my.strings.practice;

public class Ex160 {

	// Function to find longest common prefix
	public static String longestCommonPrefix(String[] arr) {

		if (arr.length == 0) {
			return "";
		}

		String prefix = arr[0];

		for (int i = 1; i < arr.length; i++) {

			while (arr[i].indexOf(prefix) != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.length() == 0) {
					return "";
				}
			}
		}

		return prefix;
	}

	public static void main(String[] args) {

		String[] arr = { "flower", "flow", "flight" };

		String result = longestCommonPrefix(arr);

		System.out.println("Longest Common Prefix: " + result);
	}
}
