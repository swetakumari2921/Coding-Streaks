package my.strings.practice;

// Decode a run-length encoded string

public class Ex43 {
	public static String decodeRLE(String encoded) {
		if (encoded == null || encoded.isEmpty()) {
			return "";
		}

		StringBuilder decoded = new StringBuilder();
		int i = 0;
		int n = encoded.length();

		while (i < n) {
			int count = 0;

			while (i < n && Character.isDigit(encoded.charAt(i))) {
				count = count * 10 + (encoded.charAt(i) - '0');
				i++;
			}

			if (i < n) {
				char ch = encoded.charAt(i);
				for (int j = 0; j < count; j++) {
					decoded.append(ch);
				}
				i++;
			}
		}

		return decoded.toString();
	}

	public static void main(String[] args) {
		String encoded = "4a3b2c";
		String decoded = decodeRLE(encoded);

		System.out.println("Encoded: " + encoded);
		System.out.println("Decoded: " + decoded);
	}
}
