package my.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(5);
		arr.add(29);
		arr.add(15);
		arr.add(1);
//		arr.add(null); // java.lang.NullPointerException
		arr.add(23);
		arr.add(5);
		arr.add(0);
		arr.add(56);
		arr.add(12);
		
		System.out.println("Before sorting");
		System.out.println(arr);
		
		System.out.println();
		
		Collections.sort(arr);
		System.out.println("After sorting");
		System.out.println(arr);
	}
}
