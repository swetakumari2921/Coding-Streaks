package my.strings.practice;

import java.util.Scanner;

public class Ex68 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s = sc.nextLine();

		System.out.println("Enter second string:");
		String t = sc.nextLine();

		if (s.length() != t.length()) {
			System.out.println("Not Isomorphic");
			return;
		}

		int[] map1 = new int[256];
		int[] map2 = new int[256];

		for (int i = 0; i < s.length(); i++) {

			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (map1[c1] == 0 && map2[c2] == 0) {
				map1[c1] = c2;
				map2[c2] = c1;
			} else if (map1[c1] != c2) {
				System.out.println("Not Isomorphic");
				return;
			}
		}

		System.out.println("Isomorphic");
	}
}
