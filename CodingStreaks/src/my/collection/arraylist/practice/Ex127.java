package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex127 {

	public static int minJumps(ArrayList<Integer> arr) {

		int n = arr.size();

		if (n <= 1)
			return 0;
		if (arr.get(0) == 0)
			return -1;

		int jumps = 0;
		int currEnd = 0;
		int farthest = 0;

		for (int i = 0; i < n - 1; i++) {

			farthest = Math.max(farthest, i + arr.get(i));

			if (i == currEnd) {
				jumps++;
				currEnd = farthest;

				if (currEnd >= n - 1)
					return jumps;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(1);
		arr.add(4);

		System.out.println(minJumps(arr));
	}
}
