package my.arrays.practice;

public class Ex102 {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 1, 7 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int difference = max - min;

		System.out.println(difference);
	}
}
