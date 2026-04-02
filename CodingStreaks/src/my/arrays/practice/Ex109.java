package my.arrays.practice;

public class Ex109 {
	public static void main(String[] args) {
		int[] arr = { 4, 9, 2, 7, 6, 3 };

		int maxOdd = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] > maxOdd) {
				maxOdd = arr[i];
			}
		}

		if (maxOdd == Integer.MIN_VALUE) {
			System.out.println("No odd number found");
		} else {
			System.out.println(maxOdd);
		}
	}
}
