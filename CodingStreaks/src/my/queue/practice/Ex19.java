package my.queue.practice;

import java.util.*;

public class Ex19 {

	public static ArrayList<Integer> maxSlidingWindow(int[] arr, int k) {

		ArrayList<Integer> result = new ArrayList<>();

		Deque<Integer> queue = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {

			// Remove elements outside the window
			if (!queue.isEmpty() && queue.peekFirst() <= i - k) {
				queue.removeFirst();
			}

			// Remove smaller elements
			while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
				queue.removeLast();
			}

			// Add current index
			queue.addLast(i);

			// Add maximum for each window
			if (i >= k - 1) {
				result.add(arr[queue.peekFirst()]);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };

		int k = 3;

		ArrayList<Integer> ans = maxSlidingWindow(arr, k);

		System.out.println("Maximum in each window: " + ans);
	}
}
