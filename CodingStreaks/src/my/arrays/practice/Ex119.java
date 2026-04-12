package my.arrays.practice;

public class Ex119 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 2, 5 };
		int value = 2;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				count++;
			}
		}

		int[] result = new int[count];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				result[j++] = arr[i];
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
