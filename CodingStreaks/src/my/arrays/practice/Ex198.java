package my.arrays.practice;

public class Ex198 {
	public static int getMaxLen(int[] nums) {
		int pos = 0; // length of subarray with positive product
		int neg = 0; // length of subarray with negative product
		int maxLen = 0;

		for (int num : nums) {
			if (num > 0) {
				pos = pos + 1;
				neg = (neg > 0) ? neg + 1 : 0;
			} else if (num < 0) {
				int temp = pos;
				pos = (neg > 0) ? neg + 1 : 0;
				neg = temp + 1;
			} else {
				pos = 0;
				neg = 0;
			}

			if (pos > maxLen) {
				maxLen = pos;
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int[] nums = { 1, -2, -3, 4 };
		System.out.println(getMaxLen(nums));
	}
}
