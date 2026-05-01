package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex125 {

	public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int k) {
		int n = a.size();
		int m = b.size();

		if (n > m)
			return kthElement(b, a, k);

		int low = Math.max(0, k - m);
		int high = Math.min(k, n);

		while (low <= high) {
			int cut1 = (low + high) / 2;
			int cut2 = k - cut1;

			int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a.get(cut1 - 1);
			int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b.get(cut2 - 1);

			int r1 = (cut1 == n) ? Integer.MAX_VALUE : a.get(cut1);
			int r2 = (cut2 == m) ? Integer.MAX_VALUE : b.get(cut2);

			if (l1 <= r2 && l2 <= r1) {
				return Math.max(l1, l2);
			} else if (l1 > r2) {
				high = cut1 - 1;
			} else {
				low = cut1 + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		a.add(2);
		a.add(3);
		a.add(6);
		a.add(7);
		a.add(9);

		b.add(1);
		b.add(4);
		b.add(8);
		b.add(10);

		int k = 5;

		System.out.println(kthElement(a, b, k));
	}
}
