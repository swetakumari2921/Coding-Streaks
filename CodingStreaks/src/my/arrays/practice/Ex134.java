package my.arrays.practice;

public class Ex134 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int maxLength = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int length = j - i + 1;
				if (length > maxLength) {
					maxLength = length;
				}
			}
		}

		System.out.println("Largest Subarray Length: " + maxLength);
	}
}
