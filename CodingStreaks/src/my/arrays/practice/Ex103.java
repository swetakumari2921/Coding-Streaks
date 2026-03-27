package my.arrays.practice;

public class Ex103 {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		int n = arr.length;

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		double avg = (double) sum / n;

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > avg) {
				count++;
			}
		}

		System.out.println(count);
	}
}
