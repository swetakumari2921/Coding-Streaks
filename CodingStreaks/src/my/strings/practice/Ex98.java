package my.strings.practice;

public class Ex98 {
	public static void main(String[] args) {
		int a = 1, b = 3, c = 2;

		String result = "";

		while (true) {
			if ((a >= b && a >= c && !endsWith(result, 'a')) || (endsWith(result, 'b') && a > 0 && a >= c)
					|| (endsWith(result, 'c') && a > 0 && a >= b)) {

				result += "a";
				a--;

			} else if ((b >= a && b >= c && !endsWith(result, 'b')) || (endsWith(result, 'a') && b > 0 && b >= c)
					|| (endsWith(result, 'c') && b > 0 && b >= a)) {

				result += "b";
				b--;

			} else if (c > 0 && !endsWith(result, 'c')) {
				result += "c";
				c--;

			} else {
				break;
			}
		}

		System.out.println(result);
	}

	public static boolean endsWith(String s, char ch) {
		int len = s.length();
		if (len < 2)
			return false;
		return s.charAt(len - 1) == ch && s.charAt(len - 2) == ch;
	}
}
