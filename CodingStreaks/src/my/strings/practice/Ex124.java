package my.strings.practice;

public class Ex124 {

	static void generate(int n, char[] arr, int pos, int open, int close) {
		if (pos == arr.length) {
			System.out.println(new String(arr));
			return;
		}

		if (open < n) {
			arr[pos] = '(';
			generate(n, arr, pos + 1, open + 1, close);
		}

		if (close < open) {
			arr[pos] = ')';
			generate(n, arr, pos + 1, open, close + 1);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		char[] arr = new char[2 * n];
		generate(n, arr, 0, 0, 0);
	}
}
