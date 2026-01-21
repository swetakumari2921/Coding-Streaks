package my.arrays.practice;

import java.util.Arrays;

public class Ex36 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 3, 2, 1 };

		if (areEqual(a, b)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	static boolean areEqual(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}
