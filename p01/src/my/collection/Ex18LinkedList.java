package my.collection;

import java.util.LinkedList;
import java.util.List;

public class Ex18LinkedList {
	public static void main(String[] args) {
		List<Integer> num = new LinkedList<>();
		num.add(10);
		num.add(20);
		num.add(-23);
		num.add(0);
		num.add(null);

		System.out.println(num);
	}
}
