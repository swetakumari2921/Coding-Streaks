package my.strings.practice;

import java.util.*;

// 7. Convert string to uppercase (without using toUpperCase())

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();

		char[] arr = str.toCharArray();

		for (byte b = 0; b < str.length(); b++) {
			if (arr[b] >= 'a' && arr[b] <= 'z') {
				arr[b] = (char) (arr[b] - 32);
			}
		}
		String result = new String(arr);
		System.out.println(result);
		sc.close();
	}
}
