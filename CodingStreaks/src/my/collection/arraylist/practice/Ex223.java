package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex223 {

	public static ArrayList<ArrayList<Integer>> generatePowerSet(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();

		int n = nums.size();
		int totalSubsets = 1 << n; // 2^n

		for (int mask = 0; mask < totalSubsets; mask++) {
			ArrayList<Integer> subset = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				if ((mask & (1 << i)) != 0) {
					subset.add(nums.get(i));
				}
			}

			powerSet.add(subset);
		}

		return powerSet;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		ArrayList<ArrayList<Integer>> result = generatePowerSet(nums);

		System.out.println("Power Set:");
		for (ArrayList<Integer> subset : result) {
			System.out.println(subset);
		}
	}
}
