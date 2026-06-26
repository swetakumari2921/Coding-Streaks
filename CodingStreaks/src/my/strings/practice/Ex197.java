package my.strings.practice;

import java.util.Scanner;

public class Ex197 {

	static int compareVersion(String v1, String v2) {
		String[] a = v1.split("\\.");
		String[] b = v2.split("\\.");

		int n = Math.max(a.length, b.length);

		for (int i = 0; i < n; i++) {
			int num1 = (i < a.length) ? Integer.parseInt(a[i]) : 0;
			int num2 = (i < b.length) ? Integer.parseInt(b[i]) : 0;

			if (num1 > num2)
				return 1;
			if (num1 < num2)
				return -1;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first version: ");
		String v1 = sc.nextLine();

		System.out.print("Enter second version: ");
		String v2 = sc.nextLine();

		int result = compareVersion(v1, v2);

		if (result == 1)
			System.out.println(v1 + " is greater");
		else if (result == -1)
			System.out.println(v2 + " is greater");
		else
			System.out.println("Both versions are equal");
	}
}
