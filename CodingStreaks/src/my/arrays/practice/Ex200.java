package my.arrays.practice;

public class Ex200 {
	public static int maxRepeating(int[] arr) {
		int maxCount = 0;
		int maxElement = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				maxElement = arr[i];
			}
		}

		return maxElement;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 2, 2, 5, 3, 2 };

		System.out.println("Maximum Repeating Number: " + maxRepeating(arr));
	}
}
