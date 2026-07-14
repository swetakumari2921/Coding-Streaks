package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex206 {

	static int count = 0;

	public static void mergeSort(ArrayList<Integer> list, int left, int right) {
		if (left >= right)
			return;

		int mid = left + (right - left) / 2;

		mergeSort(list, left, mid);
		mergeSort(list, mid + 1, right);

		countPairs(list, left, mid, right);
		merge(list, left, mid, right);
	}

	public static void countPairs(ArrayList<Integer> list, int left, int mid, int right) {
		int j = mid + 1;

		for (int i = left; i <= mid; i++) {
			while (j <= right && (long) list.get(i) > 2L * list.get(j)) {
				j++;
			}
			count += (j - (mid + 1));
		}
	}

	public static void merge(ArrayList<Integer> list, int left, int mid, int right) {

		ArrayList<Integer> temp = new ArrayList<>();

		int i = left;
		int j = mid + 1;

		while (i <= mid && j <= right) {
			if (list.get(i) <= list.get(j)) {
				temp.add(list.get(i));
				i++;
			} else {
				temp.add(list.get(j));
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
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 3, 1));

		count = 0;

		mergeSort(list, 0, list.size() - 1);

		System.out.println("Reverse Pairs = " + count);
	}
}
