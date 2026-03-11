package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex71 {

	public static boolean hasCycle(ArrayList<Integer> arr) {

		int n = arr.size();

		for (int i = 0; i < n; i++) {

			int slow = i;
			int fast = i;

			while (true) {

				slow = nextIndex(arr, slow);
				fast = nextIndex(arr, nextIndex(arr, fast));

				if (slow == -1 || fast == -1)
					break;

				if (slow == fast)
					return true;
			}
		}

		return false;
	}

	public static int nextIndex(ArrayList<Integer> arr, int index) {

		int n = arr.size();
		int next = (index + arr.get(index)) % n;

		if (next < 0)
			next += n;

		if (next == index)
			return -1;

		return next;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(-1);
		arr.add(1);
		arr.add(2);
		arr.add(2);

		System.out.println("Cycle Exists: " + hasCycle(arr));
	}
}
