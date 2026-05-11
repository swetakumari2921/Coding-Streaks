package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex137 {

	public static void reverse(ArrayList<Integer> list, int start, int end) {

		while (start < end) {

			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);

			start++;
			end--;
		}
	}

	public static void rotate(ArrayList<Integer> list, int k) {

		int n = list.size();

		k = k % n;

		// Reverse complete list
		reverse(list, 0, n - 1);

		// Reverse first k elements
		reverse(list, 0, k - 1);

		// Reverse remaining elements
		reverse(list, k, n - 1);
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int k = 2;

		rotate(list, k);

		System.out.println("Rotated ArrayList: " + list);
	}
}
