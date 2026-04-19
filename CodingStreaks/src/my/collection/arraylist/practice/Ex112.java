package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex112 {

	public static int countSubarrays(ArrayList<Integer> arr, int k) {
		int n = arr.size();
		int[] freq = new int[100000];

		int left = 0, count = 0, distinct = 0;

		for (int right = 0; right < n; right++) {
			int val = arr.get(right);

			if (freq[val] == 0)
				distinct++;

			freq[val]++;

			while (distinct > k) {
				int lval = arr.get(left);
				freq[lval]--;

				if (freq[lval] == 0)
					distinct--;

				left++;
			}

			count += (right - left + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(3);

		int k = 2;

		System.out.println(countSubarrays(arr, k));
	}
}
