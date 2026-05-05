package my.arrays.practice;

public class Ex142 {
	public static int removeDuplicates(int[] arr, int n) {
		if (n == 0)
			return 0;

		int j = 0; 

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		return j + 1; 
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		int n = arr.length;

		int newSize = removeDuplicates(arr, n);

		for (int i = 0; i < newSize; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
