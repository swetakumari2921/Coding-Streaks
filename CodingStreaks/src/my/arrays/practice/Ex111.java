package my.arrays.practice;

public class Ex111 {
	public static void main(String[] args) {
		int[] arr = { 5, -3, 7, -1, 0, -6 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
