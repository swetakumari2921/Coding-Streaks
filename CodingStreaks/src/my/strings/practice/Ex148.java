package my.strings.practice;

public class Ex148 {

	public static String compressString(String str) {

		String result = "";

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			count = 1;

			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			result = result + str.charAt(i) + count;
		}

		if (result.length() < str.length()) {
			return result;
		}

		return str;
	}

	public static void main(String[] args) {

		String str = "aaabbccccd";

		String ans = compressString(str);

		System.out.println("Compressed String: " + ans);
	}
}
