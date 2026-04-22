package my.arrays.practice;

public class Ex129 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 15 };
		int target = 10;

		int minDiff = Math.abs(arr[0] - target);
		int element = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - target);

			if (diff < minDiff) {
				minDiff = diff;
				element = arr[i];
			}
		}

		System.out.println(element);
	}
}
