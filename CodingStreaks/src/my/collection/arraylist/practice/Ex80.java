package my.collection.arraylist.practice;

public class Ex80 {
	private int[] arr;
	private int size;
	private int capacity;

	public Ex80() {
		capacity = 2;
		arr = new int[capacity];
		size = 0;
	}

	public void add(int value) {
		if (size == capacity) {
			resize();
		}
		arr[size++] = value;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Invalid index");
			return;
		}

		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	private void resize() {
		capacity = capacity * 2;
		int[] newArr = new int[capacity];

		for (int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}

		arr = newArr;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
