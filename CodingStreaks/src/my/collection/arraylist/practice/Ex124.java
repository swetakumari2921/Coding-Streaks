package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex124 {

	public static double findMedian(ArrayList<Integer> a, ArrayList<Integer> b) {

		ArrayList<Integer> merged = new ArrayList<>();

		int i = 0, j = 0;

		while (i < a.size() && j < b.size()) {
			if (a.get(i) <= b.get(j)) {
				merged.add(a.get(i));
				i++;
			} else {
				merged.add(b.get(j));
				j++;
			}
		}

		while (i < a.size()) {
			merged.add(a.get(i));
			i++;
		}

		while (j < b.size()) {
			merged.add(b.get(j));
			j++;
		}

		int n = merged.size();

		if (n % 2 == 1) {
			return merged.get(n / 2);
		} else {
			return (merged.get(n / 2 - 1) + merged.get(n / 2)) / 2.0;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		a.add(1);
		a.add(3);
		a.add(8);
		b.add(7);
		b.add(9);
		b.add(10);

		System.out.println(findMedian(a, b));
	}
}
