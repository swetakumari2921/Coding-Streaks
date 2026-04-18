package my.strings.practice;

public class Ex125 {
	static String[] result = new String[1000];
	static int size = 0;

	public static void main(String[] args) {
		String s = "()())()";
		int l = 0, r = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				l++;
			} else if (s.charAt(i) == ')') {
				if (l > 0) {
					l--;
				} else {
					r++;
				}
			}
		}

		solve(s, 0, l, r);

		for (int i = 0; i < size; i++) {
			System.out.println(result[i]);
		}
	}

	static void solve(String s, int start, int l, int r) {
		if (l == 0 && r == 0) {
			if (isValid(s)) {
				if (!exists(s)) {
					result[size++] = s;
				}
			}
			return;
		}

		for (int i = start; i < s.length(); i++) {
			if (i != start && s.charAt(i) == s.charAt(i - 1))
				continue;

			if (s.charAt(i) == '(' && l > 0) {
				solve(s.substring(0, i) + s.substring(i + 1), i, l - 1, r);
			}

			if (s.charAt(i) == ')' && r > 0) {
				solve(s.substring(0, i) + s.substring(i + 1), i, l, r - 1);
			}
		}
	}

	static boolean isValid(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				count++;
			else if (s.charAt(i) == ')') {
				count--;
				if (count < 0)
					return false;
			}
		}
		return count == 0;
	}

	static boolean exists(String s) {
		for (int i = 0; i < size; i++) {
			if (result[i].equals(s))
				return true;
		}
		return false;
	}
}
