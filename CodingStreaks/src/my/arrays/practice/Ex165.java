package my.arrays.practice;

public class Ex165 {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 103, 9 };

		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (num < 0) {
				num = -num; // handle negative numbers
			}

			while (num > 0) {
				totalSum += num % 10;
				num = num / 10;
			}
		}

		System.out.println(totalSum);
	}
}
