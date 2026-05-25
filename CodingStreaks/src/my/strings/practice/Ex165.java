package my.strings.practice;

public class Ex165 {

	// function to check if substring already exists in result
	static boolean isAlreadyAdded(String[] res, int size, String s) {
		for (int i = 0; i < size; i++) {
			if (res[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	static void findDuplicateSubstrings(String str) {
		int n = str.length();
		String[] result = new String[n * (n + 1) / 2]; // max possible substrings
		int k = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				String sub = str.substring(i, j);

				// check if this substring appears again
				for (int x = i + 1; x <= n - sub.length(); x++) {
					if (str.substring(x, x + sub.length()).equals(sub)) {

						if (!isAlreadyAdded(result, k, sub)) {
							result[k++] = sub;
						}
						break;
					}
				}
			}
		}

		// print result
		System.out.println("Duplicate substrings:");
		for (int i = 0; i < k; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		String str = "banana";
		findDuplicateSubstrings(str);
	}
}
