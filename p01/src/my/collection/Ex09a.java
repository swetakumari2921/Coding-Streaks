package my.collection;

import java.util.ArrayList;
import java.util.List;

// only public boolean remove(Object)
public class Ex09a {
	public static void main(String[] args) {
		List<String> months = new ArrayList<>();
		months.add("Jan");
		months.add("Feb");
		months.add("March");
		months.add("April");

		System.out.println("Before deletion: " + months);
		System.out.println("Is march removed? " + months.remove("March"));
		System.out.println("After deletion: " + months);
		System.out.println("Is August removed? " + months.remove("August"));
		System.out.println("After deletion: " + months);
	}
}
