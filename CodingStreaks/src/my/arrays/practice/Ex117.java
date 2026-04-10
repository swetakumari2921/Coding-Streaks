package my.arrays.practice;

public class Ex117 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int index = 2;
		int element = 25;

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		newArr[index] = element;

		for (int i = index; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
