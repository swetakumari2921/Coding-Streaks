package my.strings.practice;

import java.util.*;

// 13. Count all characters in a string

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		System.out.println(count);
	}
}
