package my.arrays.practice;

public class Ex124 {
	static int findFirst(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 7, 9 };
		int target = 7;

		int result = findFirst(arr, target);

		if (result != -1)
			System.out.println(result);
		else
			System.out.println("Not found");
	}
}
