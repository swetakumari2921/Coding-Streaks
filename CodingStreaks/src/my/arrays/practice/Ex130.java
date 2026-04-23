package my.arrays.practice;

public class Ex130 {
	static boolean checkPair(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[i] - arr[j];
				if (diff < 0) {
					diff = -diff;
				}
				if (diff <= k) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 3, 8, 15 };
		int k = 4;

		if (checkPair(arr, k)) {
			System.out.println("Pair exists");
		} else {
			System.out.println("No pair exists");
		}
	}
}
