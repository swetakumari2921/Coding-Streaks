package my.arrays.practice;

import java.util.HashMap;

public class Ex46 {

	public static int subarraysDivByK(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);

		int prefixSum = 0;
		int count = 0;

		for (int num : nums) {
			prefixSum += num;

			int remainder = prefixSum % k;
			if (remainder < 0) {
				remainder += k;
			}

			count += map.getOrDefault(remainder, 0);
			map.put(remainder, map.getOrDefault(remainder, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		System.out.println("Number of subarrays: " + subarraysDivByK(nums, k));
	}
}
