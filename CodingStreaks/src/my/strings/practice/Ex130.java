package my.strings.practice;

public class Ex130 {
	static int count = 0;

	static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static void findSubsequences(String str, String curr, int index) {
		if (index == str.length()) {
			if (curr.length() > 0 && isPalindrome(curr)) {
				count++;
			}
			return;
		}

		findSubsequences(str, curr + str.charAt(index), index + 1);
		findSubsequences(str, curr, index + 1);
	}

	public static void main(String[] args) {
		String str = "aba";
		findSubsequences(str, "", 0);
		System.out.println(count);
	}
}
