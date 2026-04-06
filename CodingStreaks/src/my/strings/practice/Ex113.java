package my.strings.practice;

public class Ex113 {
	public static boolean isRepeated(String str) {
		int n = str.length();

		for (int len = 1; len <= n / 2; len++) {
			if (n % len == 0) {
				String sub = str.substring(0, len);
				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < n / len; i++)
					sb.append(sub);

				if (sb.toString().equals(str))
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "ababab";
		if (isRepeated(str))
			System.out.println("Yes, it is repetition of a substring");
		else
			System.out.println("No, it is not");
	}
}
