package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex184 {

	static int firstPosition(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size() - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (list.get(mid) == target) {
				result = mid;
				high = mid - 1; // search left side
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return result;
	}

	static int lastPosition(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size() - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (list.get(mid) == target) {
				result = mid;
				low = mid + 1; // search right side
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);

		int target = 2;

		System.out.println("First Position: " + firstPosition(list, target));
		System.out.println("Last Position: " + lastPosition(list, target));
	}
}
