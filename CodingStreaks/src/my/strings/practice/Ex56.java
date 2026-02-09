package my.strings.practice;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();

		char[] arr = s.toCharArray();
		int n = arr.length;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (index == 0 || arr[i] != arr[index - 1]) {
				arr[index++] = arr[i];
			}
		}

		String result = new String(arr, 0, index);
		System.out.println("String after removing adjacent duplicates: " + result);
	}
}
