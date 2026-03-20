package my.arrays.practice;

public class Ex95 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		int n = arr.length;
		int[] deque = new int[n]; // stores indices
		int front = 0, rear = -1;

		for (int i = 0; i < n; i++) {

			if (front <= rear && deque[front] <= i - k) {
				front++;
			}

			while (front <= rear && arr[deque[rear]] < arr[i]) {
				rear--;
			}

			deque[++rear] = i;

			if (i >= k - 1) {
				System.out.print(arr[deque[front]] + " ");
			}
		}
	}
}
