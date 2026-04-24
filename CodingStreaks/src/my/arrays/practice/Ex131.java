package my.arrays.practice;

public class Ex131 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				count++;
			}
		}

		System.out.println("Total subarrays: " + count);
	}
}
