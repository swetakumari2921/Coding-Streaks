package my.strings.practice;

// 23. Check if string is empty or null

import java.util.*;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();

		if (str == null || str.trim().isEmpty()) {
			System.out.println("String is empty or null");
		} else {
			System.out.println("String: " + str);
		}
		sc.close();
	}
}
