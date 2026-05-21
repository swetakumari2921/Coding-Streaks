package my.arrays.practice;

public class Ex164 {

	public static boolean areMultiples(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % k != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };
		int k = 10;

		boolean result = areMultiples(arr, k);

		if (result) {
			System.out.println("All elements are multiples of " + k);
		} else {
			System.out.println("Not all elements are multiples of " + k);
		}
	}
}
