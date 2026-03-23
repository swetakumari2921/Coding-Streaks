package my.strings.practice;

public class Ex99 {
	public static void main(String[] args) {
		String s = "aaabbc";
		String compressed = compressString(s);
		System.out.println(compressed); // Output: a3b2c1
	}

	public static String compressString(String s) {
		if (s == null || s.length() == 0)
			return "";

		String result = "";
		char currChar = s.charAt(0);
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == currChar) {
				count++;
			} else {
				result += currChar + String.valueOf(count);
				currChar = s.charAt(i);
				count = 1;
			}
		}

		// Append last character count
		result += currChar + String.valueOf(count);
		return result;
	}
}
