package my.strings.practice;

public class Ex151 {

	public static void longestSubstring(String str) {
		int n = str.length();

		int maxLength = 0;
		int start = 0;

		for (int i = 0; i < n; i++) {

			boolean[] visited = new boolean[256];

			for (int j = i; j < n; j++) {

				char ch = str.charAt(j);

				if (visited[ch]) {
					break;
				}

				visited[ch] = true;

				if (j - i + 1 > maxLength) {
					maxLength = j - i + 1;
					start = i;
				}
			}
		}

		System.out.println("Longest Substring: " + str.substring(start, start + maxLength));

		System.out.println("Length: " + maxLength);
	}

	public static void main(String[] args) {

		String str = "abcabcbb";

		longestSubstring(str);
	}
}
