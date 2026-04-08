package my.arrays.practice;

public class Ex115 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;

		int start = n / 2;
		int end = n - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
