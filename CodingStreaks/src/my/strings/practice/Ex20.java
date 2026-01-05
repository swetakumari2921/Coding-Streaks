package my.strings.practice;

import java.util.*;

// Find first repeating character

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		int i, j;

		for (i = 0; i < chars.length; i++) {
			for (j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println("First repeating character: " + chars[i]);
					sc.close();
					return;

				}
			}
		}
		System.out.println("No repeating character found!");
	}
}
