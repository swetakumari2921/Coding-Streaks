package my.arrays.practice;

public class Ex120 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int n = arr.length;

		int[] result = new int[2 * n];

		int j = 0;
		for (int i = 0; i < n; i++) {
			result[j++] = arr[i];
			result[j++] = arr[i];
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
