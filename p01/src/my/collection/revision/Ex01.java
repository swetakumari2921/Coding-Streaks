package my.collection.revision;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		List<String> months = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for ArrayList: ");
		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Size should be greater than 0");
			sc.close();
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.println("Enter month " + (i + 1) + ": ");
			String element = sc.next();
			months.add(element);
		}

		System.out.print("Entered months are: ");
		System.out.println(months);

		System.out.println();
		System.out.println("Print them back vertically");
		
//		for (int i = months.size()-1; i >= 0; i--) {
//			System.out.println(months.get(i));
//		}
		
		for(String month : months) {
			System.out.println(month);
		}
		sc.close();

	}
}
