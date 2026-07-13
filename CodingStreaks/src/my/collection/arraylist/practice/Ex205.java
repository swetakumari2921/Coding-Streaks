package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex205 {

	static int mergeSort(ArrayList<Integer> list, int left, int right) {
		int inversions = 0;

		if (left < right) {
			int mid = left + (right - left) / 2;

			inversions += mergeSort(list, left, mid);
			inversions += mergeSort(list, mid + 1, right);
			inversions += merge(list, left, mid, right);
		}

		return inversions;
	}

	static int merge(ArrayList<Integer> list, int left, int mid, int right) {
		ArrayList<Integer> temp = new ArrayList<>();

		int i = left;
		int j = mid + 1;
		int inversions = 0;

		while (i <= mid && j <= right) {
			if (list.get(i) <= list.get(j)) {
				temp.add(list.get(i));
				i++;
			} else {
				temp.add(list.get(j));
				inversions += (mid - i + 1);
				j++;
			}
		}

		while (i <= mid) {
			temp.add(list.get(i));
			i++;
		}

		while (j <= right) {
			temp.add(list.get(j));
			j++;
		}

		for (int k = 0; k < temp.size(); k++) {
			list.set(left + k, temp.get(k));
		}

		return inversions;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(8);
		list.add(4);
		list.add(2);
		list.add(1);

		System.out.println("Original ArrayList: " + list);

		int inversions = mergeSort(list, 0, list.size() - 1);

		System.out.println("Sorted ArrayList: " + list);
		System.out.println("Inversion Count: " + inversions);
	}
}
