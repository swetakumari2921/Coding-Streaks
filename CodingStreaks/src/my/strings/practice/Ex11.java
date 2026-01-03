package my.strings.practice;

import java.util.*;

// 12. Compare two strings (without using equals())

public class Ex11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1: ");
		String str1 = sc.next();

		System.out.println("Enter String 2: ");
		String str2 = sc.next();

		boolean isSame = true;

		if (str1.length() != str2.length()) {
			isSame = false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					isSame = false;
					break;
				}
			}
		}
		if (isSame) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}
		sc.close();
	}

}