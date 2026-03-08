package my.strings.practice;

public class Ex83 {

	public static void search(String text, String pattern) {

		String concat = pattern + "$" + text;
		int n = concat.length();
		int[] Z = new int[n];

		int L = 0, R = 0;

		for (int i = 1; i < n; i++) {

			if (i > R) {
				L = R = i;

				while (R < n && concat.charAt(R - L) == concat.charAt(R)) {
					R++;
				}

				Z[i] = R - L;
				R--;

			} else {

				int k = i - L;

				if (Z[k] < R - i + 1) {
					Z[i] = Z[k];
				} else {

					L = i;

					while (R < n && concat.charAt(R - L) == concat.charAt(R)) {
						R++;
					}

					Z[i] = R - L;
					R--;
				}
			}
		}

		int pLen = pattern.length();

		for (int i = 0; i < n; i++) {
			if (Z[i] == pLen) {
				System.out.println("Pattern found at index: " + (i - pLen - 1));
			}
		}
	}

	public static void main(String[] args) {

		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABC";

		search(text, pattern);
	}
}
