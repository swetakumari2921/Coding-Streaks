package my.strings.practice;

import java.util.Scanner;

public class Ex170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s1 = sc.nextLine();

		System.out.println("Enter second string:");
		String s2 = sc.nextLine();

		if (s1.length() != s2.length()) {
			System.out.println("Strings are not isomorphic");
			return;
		}

		char[] map1 = new char[256];
		char[] map2 = new char[256];

		boolean isomorphic = true;

		for (int i = 0; i < s1.length(); i++) {

			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (map1[c1] == 0 && map2[c2] == 0) {
				map1[c1] = c2;
				map2[c2] = c1;
			} else if (map1[c1] != c2 || map2[c2] != c1) {
				isomorphic = false;
				break;
			}
		}

		if (isomorphic) {
			System.out.println("Strings are isomorphic");
		} else {
			System.out.println("Strings are not isomorphic");
		}

		sc.close();
	}
}
