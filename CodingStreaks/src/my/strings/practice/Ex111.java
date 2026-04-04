package my.strings.practice;

public class Ex111 {
	static int fact(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}

	static int findRank(String str) {
		int n = str.length();
		int rank = 1;

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = i + 1; j < n; j++) {
				if (str.charAt(j) < str.charAt(i)) {
					count++;
				}
			}

			rank += count * fact(n - i - 1);
		}

		return rank;
	}

	public static void main(String[] args) {
		String str = "CAB";
		System.out.println(findRank(str));
	}
}
