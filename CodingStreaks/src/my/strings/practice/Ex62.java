package my.strings.practice;

import java.util.Scanner;

public class Ex62 {

	public static String findSmallestRotation(String str) {
		int n = str.length();
		String result = str;

		for (int i = 1; i < n; i++) {
			String rotation = str.substring(i) + str.substring(0, i);
			if (rotation.compareTo(result) < 0) {
				result = rotation;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.nextLine();

		String smallest = findSmallestRotation(str);

		System.out.println("Smallest Lexicographic Rotation: " + smallest);
	}
}
