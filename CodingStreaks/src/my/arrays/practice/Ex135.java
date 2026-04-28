package my.arrays.practice;

public class Ex135 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum % 2 == 0) {
					count++;
				}
			}
		}

		System.out.println("Count of subarrays with even sum: " + count);
	}
}
