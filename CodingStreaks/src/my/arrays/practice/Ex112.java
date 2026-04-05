package my.arrays.practice;

public class Ex112 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 3, 10, 7 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = -1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
