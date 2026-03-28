package my.arrays.practice;

public class Ex104 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
