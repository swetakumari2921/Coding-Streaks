package my.collection.arraylist.practice;

import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of arrayliast: ");
		int size = sc.nextInt();
		sc.nextLine();

		if (size <= 0) {
			System.out.println("Size should be greater than 0");
			sc.close();
			return;
		}

		System.out.println("Enter type of input: ");
		String type = sc.nextLine().trim();

		if (type.equalsIgnoreCase("Integer")) {
			List<Integer> nums = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter element " + (i + 1) + ": ");
				int element = sc.nextInt();
				nums.add(element);
			}
			System.out.println("Size: " + size);
			System.out.print("Elements: ");
			for (int i = 0; i < size; i++) {
				System.out.print(nums.get(i) + " ");
			}
			sc.close();
			return;
		} else if (type.equalsIgnoreCase("String")) {
			List<String> str = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter element " + (i + 1) + ": ");
				String strInput = sc.next();
				str.add(strInput);
			}
			System.out.println("Size: " + size);
			System.out.print("Elements: ");
			for (int i = 0; i < size; i++) {
				System.out.print(str.get(i) + " ");
			}
			sc.close();
			return;
		} else if (type.equalsIgnoreCase("Double")) {
			List<Double> dbl = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter element " + (i + 1) + ": ");
				double dblInput = sc.nextDouble();
				dbl.add(dblInput);
			}
			System.out.println("Size: " + size);
			System.out.print("Elements: ");
			for (int i = 0; i < size; i++) {
				System.out.print(dbl.get(i) + " ");
			}
			sc.close();
			return;
		}
		System.out.println("Size: " + size);
	}
}
