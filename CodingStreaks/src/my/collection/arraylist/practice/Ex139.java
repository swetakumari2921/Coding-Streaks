package my.collection.arraylist.practice;

public class Ex139 {

	public static int sumEvenIndex(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int result = sumEvenIndex(arr);

		System.out.println("Sum of even index elements = " + result);
	}
}
