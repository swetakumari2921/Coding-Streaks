package my.strings.practice;

public class Ex129 {

	public static void main(String[] args) {
		String str = "123";
		int k = 4;

		char[] arr = str.toCharArray();
		int[] count = { 0 };

		findPermutation(arr, 0, k, count);
	}

	static void findPermutation(char[] arr, int index, int k, int[] count) {
		if (index == arr.length) {
			count[0]++;
			if (count[0] == k) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
			}
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(arr, index, i);
			findPermutation(arr, index + 1, k, count);
			swap(arr, index, i);
		}
	}

	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
