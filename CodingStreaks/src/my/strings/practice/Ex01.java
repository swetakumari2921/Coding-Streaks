package my.strings.practice;

import java.util.*;

// 2. Find length of a string (without using length())

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		byte count = 0;

		for (byte b = 0; b<ch.length; b++) {
			count++;
		}

		System.out.println("Length: " + count);
		sc.close();
	}
}
