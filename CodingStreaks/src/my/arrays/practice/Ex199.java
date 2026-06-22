package my.arrays.practice;

public class Ex199 {
	public static int countPairs(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) % k == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 7, 5, 3 };
		int k = 4;

		System.out.println("Number of pairs: " + countPairs(arr, k));
	}
}
