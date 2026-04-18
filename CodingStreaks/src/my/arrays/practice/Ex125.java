package my.arrays.practice;

public class Ex125 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 3, 9, 3 };
		int key = 3;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
			}
		}

		System.out.println(index);
	}
}
