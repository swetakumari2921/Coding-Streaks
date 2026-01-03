package my.strings.practice;

import java.util.*;

// 15. Find ASCII value of each character

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		char[] arr = str.toCharArray();

		System.out.println("ASCII values of each character:");
		for (int i = 0; i < str.length(); i++) {
			int ascii = arr[i];
			System.out.println(arr[i] + ": " + ascii);
		}
		sc.close();
	}
}
