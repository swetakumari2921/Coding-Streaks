package my.arrays.practice;

public class Ex118 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int index = 2;

		if (index < 0 || index >= arr.length) {
			System.out.println("Invalid index");
			return;
		}

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
