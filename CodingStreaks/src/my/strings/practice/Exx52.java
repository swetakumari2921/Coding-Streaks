package my.strings.practice;

import java.util.Scanner;

public class Exx52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter main string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter subsequence string: ");
		String str2 = sc.nextLine();

		int i = 0, j = 0;

		while (i < str1.length() && j < str2.length()) {
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			i++;
		}

		if (j == str2.length()) {
			System.out.println("Yes, it is a subsequence");
		} else {
			System.out.println("No, it is not a subsequence");
		}
	}
}
