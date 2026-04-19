package my.strings.practice;

public class Ex126 {
	public static int minReversals(String s) {
		int n = s.length();

		if (n % 2 != 0)
			return -1;

		int open = 0, close = 0;

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);

			if (ch == '(') {
				open++;
			} else {
				if (open > 0) {
					open--;
				} else {
					close++;
				}
			}
		}

		int ans = (open + 1) / 2 + (close + 1) / 2;
		return ans;
	}

	public static void main(String[] args) {
		String s = "))((";
		System.out.println(minReversals(s));
	}
}
