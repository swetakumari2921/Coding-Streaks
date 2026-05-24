package my.arrays.practice;

public class Ex167 {

	public static boolean isGeometricProgression(int[] arr) {

		int n = arr.length;

		if (n < 2) {
			return true;
		}

		// Handle division by zero
		if (arr[0] == 0) {

			for (int i = 1; i < n; i++) {
				if (arr[i] != 0) {
					return false;
				}
			}

			return true;
		}

		double ratio = (double) arr[1] / arr[0];

		for (int i = 1; i < n - 1; i++) {

			if (arr[i] == 0) {
				return false;
			}

			double currentRatio = (double) arr[i + 1] / arr[i];

			if (currentRatio != ratio) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 6, 18, 54, 162 };

		if (isGeometricProgression(arr)) {
			System.out.println("Array forms Geometric Progression");
		} else {
			System.out.println("Array does not form Geometric Progression");
		}
	}
}
