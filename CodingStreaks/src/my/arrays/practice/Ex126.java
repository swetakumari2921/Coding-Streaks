package my.arrays.practice;

public class Ex126 {
	public static int findClosest(int[] arr, int target) {
		int closest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i] - target) < Math.abs(closest - target)) {
				closest = arr[i];
			}
		}

		return closest;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 10, 14 };
		int target = 9;

		System.out.println(findClosest(arr, target));
	}
}
