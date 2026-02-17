package my.strings.practice;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Palindromic partitions:");
		partition(str, "", 0);
	}

	static void partition(String str, String ans, int start) {
		if (start == str.length()) {
			System.out.println(ans);
			return;
		}
		for (int i = start; i < str.length(); i++) {
			if (isPalindrome(str, start, i)) {
				String part = str.substring(start, i + 1);
				if (ans.equals(""))
					partition(str, part, i + 1);
				else
					partition(str, ans + " | " + part, i + 1);
			}
		}
	}

	static boolean isPalindrome(String s, int l, int r) {
		while (l < r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}
}
