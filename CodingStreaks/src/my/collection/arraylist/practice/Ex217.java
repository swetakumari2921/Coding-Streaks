package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex217 {

	public static boolean canPartitionKSubsets(ArrayList<Integer> nums, int k) {
		int totalSum = 0;

		for (int num : nums) {
			totalSum += num;
		}

		if (totalSum % k != 0) {
			return false;
		}

		int target = totalSum / k;
		boolean[] used = new boolean[nums.size()];

		return backtrack(nums, used, k, 0, 0, target);
	}

	private static boolean backtrack(ArrayList<Integer> nums, boolean[] used, int k, int start, int currentSum,
			int target) {

		if (k == 1) {
			return true;
		}

		if (currentSum == target) {
			return backtrack(nums, used, k - 1, 0, 0, target);
		}

		for (int i = start; i < nums.size(); i++) {
			if (used[i]) {
				continue;
			}

			if (currentSum + nums.get(i) > target) {
				continue;
			}

			used[i] = true;

			if (backtrack(nums, used, k, i + 1, currentSum + nums.get(i), target)) {
				return true;
			}

			used[i] = false;
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(2);
		nums.add(1);

		int k = 4;

		if (canPartitionKSubsets(nums, k)) {
			System.out.println("Can be partitioned into " + k + " equal sum subsets.");
		} else {
			System.out.println("Cannot be partitioned into " + k + " equal sum subsets.");
		}
	}
}
