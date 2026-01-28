package my.strings.practice;

public class Ex42 {
	public static String encode(String str) {
		if (str == null || str.length() == 0)
			return "";

		StringBuilder encoded = new StringBuilder();
		int count = 1;

		for (int i = 1; i <= str.length(); i++) {
			if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				encoded.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		return encoded.toString();
	}

	public static void main(String[] args) {
		String input = "aaabbccccd";
		System.out.println(encode(input));
	}
}
