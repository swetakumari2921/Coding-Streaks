package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex202 {

	public static ArrayList<Integer> xorQueries(ArrayList<Integer> arr, int[][] queries) {

		ArrayList<Integer> prefixXor = new ArrayList<>();

		int xor = 0;
		for (int num : arr) {
			xor ^= num;
			prefixXor.add(xor);
		}

		ArrayList<Integer> result = new ArrayList<>();

		for (int[] query : queries) {
			int left = query[0];
			int right = query[1];

			if (left == 0) {
				result.add(prefixXor.get(right));
			} else {
				result.add(prefixXor.get(right) ^ prefixXor.get(left - 1));
			}
		}

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(8);

		int[][] queries = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };

		ArrayList<Integer> answer = xorQueries(arr, queries);

		System.out.println("XOR of subarray queries:");
		for (int value : answer) {
			System.out.println(value);
		}
	}
}
