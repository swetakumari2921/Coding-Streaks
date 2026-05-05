package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex130 {

	public static int countSubarrays(int[] arr, int K) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		int xor = 0;

		list.add(0); // important for subarrays starting from index 0

		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];

			for (int j = 0; j < list.size(); j++) {
				if ((xor ^ K) == list.get(j)) {
					count++;
				}
			}

			list.add(xor);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int K = 6;

		System.out.println(countSubarrays(arr, K));
	}
}
